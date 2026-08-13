package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ContactRequestDTO;
import com.example.demo.dto.ContactResponseDTO;
import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    // Constructor Injection
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // CREATE
    @Override
    public ContactResponseDTO createContact(ContactRequestDTO requestDTO) {

        Contact contact = new Contact();

        contact.setName(requestDTO.getName());
        contact.setEmail(requestDTO.getEmail());
        contact.setPhone(requestDTO.getPhone());
        contact.setAddress(requestDTO.getAddress());

        Contact savedContact = contactRepository.save(contact);

        return convertToResponseDTO(savedContact);
    }

    // GET ALL
    @Override
    public List<ContactResponseDTO> getAllContacts() {

        List<Contact> contacts = contactRepository.findAll();

        return contacts.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    // GET BY ID
    @Override
    public ContactResponseDTO getContactById(Long id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Contact not found with id: " + id));

        return convertToResponseDTO(contact);
    }

    // UPDATE
    @Override
    public ContactResponseDTO updateContact(
            Long id,
            ContactRequestDTO requestDTO) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Contact not found with id: " + id));

        contact.setName(requestDTO.getName());
        contact.setEmail(requestDTO.getEmail());
        contact.setPhone(requestDTO.getPhone());
        contact.setAddress(requestDTO.getAddress());

        Contact updatedContact = contactRepository.save(contact);

        return convertToResponseDTO(updatedContact);
    }

    // DELETE
    @Override
    public void deleteContact(Long id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Contact not found with id: " + id));

        contactRepository.delete(contact);
    }

    // SEARCH BY NAME
    @Override
    public List<ContactResponseDTO> searchByName(String name) {

        List<Contact> contacts =
                contactRepository.findByNameContainingIgnoreCase(name);

        return contacts.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    // SEARCH BY PHONE
    @Override
    public ContactResponseDTO searchByPhone(String phone) {

        Contact contact = contactRepository.findByPhone(phone)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Contact not found with phone: " + phone));

        return convertToResponseDTO(contact);
    }

    // Entity → Response DTO
    private ContactResponseDTO convertToResponseDTO(Contact contact) {

        return new ContactResponseDTO(
                contact.getId(),
                contact.getName(),
                contact.getEmail(),
                contact.getPhone(),
                contact.getAddress()
        );
    }
}