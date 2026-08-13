package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.dto.ContactRequestDTO;
import com.example.demo.dto.ContactResponseDTO;
import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@ExtendWith(MockitoExtension.class)
class ContactServiceImplTest {

    @Mock
    private ContactRepository contactRepository;

    @InjectMocks
    private ContactServiceImpl contactService;

    private Contact contact;
    private ContactRequestDTO requestDTO;

    @BeforeEach
    void setUp() {

        contact = new Contact();
        contact.setId(1L);
        contact.setName("Saksham Jain");
        contact.setEmail("saksham@gmail.com");
        contact.setPhone("9876543210");
        contact.setAddress("Bhopal");

        requestDTO = new ContactRequestDTO(
                "Saksham Jain",
                "saksham@gmail.com",
                "9876543210",
                "Bhopal"
        );
    }

    // CREATE TEST
    @Test
    void createContactTest() {

        when(contactRepository.save(any(Contact.class)))
                .thenReturn(contact);

        ContactResponseDTO response =
                contactService.createContact(requestDTO);

        assertNotNull(response);
        assertEquals(1L, response.getId());
        assertEquals("Saksham Jain", response.getName());
        assertEquals("saksham@gmail.com", response.getEmail());
        assertEquals("9876543210", response.getPhone());
        assertEquals("Bhopal", response.getAddress());

        verify(contactRepository, times(1))
                .save(any(Contact.class));
    }

    // GET ALL TEST
    @Test
    void getAllContactsTest() {

        Contact contact2 = new Contact();

        contact2.setId(2L);
        contact2.setName("Aviral Jain");
        contact2.setEmail("aviral@gmail.com");
        contact2.setPhone("9876543211");
        contact2.setAddress("Indore");

        when(contactRepository.findAll())
                .thenReturn(Arrays.asList(contact, contact2));

        List<ContactResponseDTO> response =
                contactService.getAllContacts();

        assertEquals(2, response.size());

        assertEquals("Saksham Jain",
                response.get(0).getName());

        assertEquals("Aviral Jain",
                response.get(1).getName());

        verify(contactRepository, times(1)).findAll();
    }

    // GET BY ID TEST
    @Test
    void getContactByIdTest() {

        when(contactRepository.findById(1L))
                .thenReturn(Optional.of(contact));

        ContactResponseDTO response =
                contactService.getContactById(1L);

        assertNotNull(response);
        assertEquals(1L, response.getId());
        assertEquals("Saksham Jain", response.getName());

        verify(contactRepository, times(1))
                .findById(1L);
    }

    // GET BY ID - NOT FOUND
    @Test
    void getContactByIdNotFoundTest() {

        when(contactRepository.findById(99L))
                .thenReturn(Optional.empty());

        assertThrows(
                RuntimeException.class,
                () -> contactService.getContactById(99L)
        );

        verify(contactRepository, times(1))
                .findById(99L);
    }

    // UPDATE TEST
    @Test
    void updateContactTest() {

        when(contactRepository.findById(1L))
                .thenReturn(Optional.of(contact));

        when(contactRepository.save(any(Contact.class)))
                .thenReturn(contact);

        ContactRequestDTO updateRequest =
                new ContactRequestDTO(
                        "Saksham Updated",
                        "updated@gmail.com",
                        "9999999999",
                        "Delhi"
                );

        ContactResponseDTO response =
                contactService.updateContact(
                        1L,
                        updateRequest
                );

        assertNotNull(response);

        verify(contactRepository, times(1))
                .findById(1L);

        verify(contactRepository, times(1))
                .save(any(Contact.class));
    }

    // DELETE TEST
    @Test
    void deleteContactTest() {

        when(contactRepository.findById(1L))
                .thenReturn(Optional.of(contact));

        doNothing()
                .when(contactRepository)
                .delete(contact);

        contactService.deleteContact(1L);

        verify(contactRepository, times(1))
                .findById(1L);

        verify(contactRepository, times(1))
                .delete(contact);
    }

    // SEARCH BY NAME TEST
    @Test
    void searchByNameTest() {

        when(contactRepository
                .findByNameContainingIgnoreCase("Saksham"))
                .thenReturn(List.of(contact));

        List<ContactResponseDTO> response =
                contactService.searchByName("Saksham");

        assertEquals(1, response.size());
        assertEquals(
                "Saksham Jain",
                response.get(0).getName()
        );

        verify(contactRepository, times(1))
                .findByNameContainingIgnoreCase("Saksham");
    }

    // SEARCH BY PHONE TEST
    @Test
    void searchByPhoneTest() {

        when(contactRepository.findByPhone("9876543210"))
                .thenReturn(Optional.of(contact));

        ContactResponseDTO response =
                contactService.searchByPhone("9876543210");

        assertNotNull(response);
        assertEquals(
                "Saksham Jain",
                response.getName()
        );

        verify(contactRepository, times(1))
                .findByPhone("9876543210");
    }
}