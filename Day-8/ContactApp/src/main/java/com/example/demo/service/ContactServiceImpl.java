package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ContactDTO;
import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public ContactDTO createContact(ContactDTO contactDTO) {

        Contact contact = new Contact();

        contact.setName(contactDTO.getName());
        contact.setEmail(contactDTO.getEmail());
        contact.setPhone(contactDTO.getPhone());
        contact.setAddress(contactDTO.getAddress());

        Contact savedContact = contactRepository.save(contact);

        return convertToDTO(savedContact);
    }

    @Override
    public List<ContactDTO> getAllContacts() {

        List<Contact> contacts = contactRepository.findAll();

        return contacts.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ContactDTO getContactById(Long id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found with id: " + id));

        return convertToDTO(contact);
    }

    @Override
    public ContactDTO updateContact(Long id, ContactDTO contactDTO) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found with id: " + id));

        contact.setName(contactDTO.getName());
        contact.setEmail(contactDTO.getEmail());
        contact.setPhone(contactDTO.getPhone());
        contact.setAddress(contactDTO.getAddress());

        Contact updatedContact = contactRepository.save(contact);

        return convertToDTO(updatedContact);
    }

    @Override
    public void deleteContact(Long id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found with id: " + id));

        contactRepository.delete(contact);
    }

    private ContactDTO convertToDTO(Contact contact) {

        ContactDTO dto = new ContactDTO();

        dto.setName(contact.getName());
        dto.setEmail(contact.getEmail());
        dto.setPhone(contact.getPhone());
        dto.setAddress(contact.getAddress());

        return dto;
    }
}