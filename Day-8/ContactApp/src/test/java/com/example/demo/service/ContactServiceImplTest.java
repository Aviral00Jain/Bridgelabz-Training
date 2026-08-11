package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.dto.ContactDTO;
import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@ExtendWith(MockitoExtension.class)
class ContactServiceImplTest {

    @Mock
    private ContactRepository contactRepository;

    @InjectMocks
    private ContactServiceImpl contactService;

    private Contact contact;
    private ContactDTO contactDTO;

    @BeforeEach
    void setUp() {

        contact = new Contact(
                1L,
                "Saksham Jain",
                "saksham@gmail.com",
                "9876543210",
                "Bhopal"
        );

        contactDTO = new ContactDTO(
                "Saksham Jain",
                "saksham@gmail.com",
                "9876543210",
                "Bhopal"
        );
    }

    // 1. CREATE CONTACT
    @Test
    void testCreateContact() {

        when(contactRepository.save(org.mockito.ArgumentMatchers.any(Contact.class)))
                .thenReturn(contact);

        ContactDTO result = contactService.createContact(contactDTO);

        assertEquals("Saksham Jain", result.getName());
        assertEquals("saksham@gmail.com", result.getEmail());
        assertEquals("9876543210", result.getPhone());
        assertEquals("Bhopal", result.getAddress());

        verify(contactRepository, times(1))
                .save(org.mockito.ArgumentMatchers.any(Contact.class));
    }

    // 2. GET ALL CONTACTS
    @Test
    void testGetAllContacts() {

        Contact contact2 = new Contact(
                2L,
                "Aviral Jain",
                "aviral@gmail.com",
                "9123456780",
                "Indore"
        );

        when(contactRepository.findAll())
                .thenReturn(Arrays.asList(contact, contact2));

        List<ContactDTO> result = contactService.getAllContacts();

        assertEquals(2, result.size());
        assertEquals("Saksham Jain", result.get(0).getName());
        assertEquals("Aviral Jain", result.get(1).getName());

        verify(contactRepository, times(1)).findAll();
    }

    // 3. GET CONTACT BY ID - SUCCESS
    @Test
    void testGetContactById() {

        when(contactRepository.findById(1L))
                .thenReturn(Optional.of(contact));

        ContactDTO result = contactService.getContactById(1L);

        assertEquals("Saksham Jain", result.getName());
        assertEquals("saksham@gmail.com", result.getEmail());

        verify(contactRepository, times(1)).findById(1L);
    }

    // 4. GET CONTACT BY ID - NOT FOUND
    @Test
    void testGetContactByIdNotFound() {

        when(contactRepository.findById(999L))
                .thenReturn(Optional.empty());

        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> contactService.getContactById(999L)
        );

        assertEquals(
                "Contact not found with id: 999",
                exception.getMessage()
        );

        verify(contactRepository, times(1)).findById(999L);
    }

    // 5. UPDATE CONTACT - SUCCESS
    @Test
    void testUpdateContact() {

        ContactDTO updatedDTO = new ContactDTO(
                "Saksham Kumar",
                "sakshamkumar@gmail.com",
                "9999999999",
                "Bhopal"
        );

        when(contactRepository.findById(1L))
                .thenReturn(Optional.of(contact));

        when(contactRepository.save(contact))
                .thenReturn(contact);

        ContactDTO result =
                contactService.updateContact(1L, updatedDTO);

        assertEquals("Saksham Kumar", result.getName());
        assertEquals("sakshamkumar@gmail.com", result.getEmail());
        assertEquals("9999999999", result.getPhone());

        verify(contactRepository, times(1)).findById(1L);
        verify(contactRepository, times(1)).save(contact);
    }

    // 6. UPDATE CONTACT - NOT FOUND
    @Test
    void testUpdateContactNotFound() {

        when(contactRepository.findById(999L))
                .thenReturn(Optional.empty());

        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> contactService.updateContact(999L, contactDTO)
        );

        assertEquals(
                "Contact not found with id: 999",
                exception.getMessage()
        );

        verify(contactRepository, times(1)).findById(999L);
    }

    // 7. DELETE CONTACT - SUCCESS
    @Test
    void testDeleteContact() {

        when(contactRepository.findById(1L))
                .thenReturn(Optional.of(contact));

        contactService.deleteContact(1L);

        verify(contactRepository, times(1))
                .findById(1L);

        verify(contactRepository, times(1))
                .delete(contact);
    }

    // 8. DELETE CONTACT - NOT FOUND
    @Test
    void testDeleteContactNotFound() {

        when(contactRepository.findById(999L))
                .thenReturn(Optional.empty());

        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> contactService.deleteContact(999L)
        );

        assertEquals(
                "Contact not found with id: 999",
                exception.getMessage()
        );

        verify(contactRepository, times(1))
                .findById(999L);
    }
}