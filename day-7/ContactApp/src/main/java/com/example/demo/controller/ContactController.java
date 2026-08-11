package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ContactDTO;
import com.example.demo.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<ContactDTO> createContact(
            @RequestBody ContactDTO contactDTO) {

        ContactDTO savedContact = contactService.createContact(contactDTO);

        return new ResponseEntity<>(savedContact, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ContactDTO>> getAllContacts() {

        List<ContactDTO> contacts = contactService.getAllContacts();

        return ResponseEntity.ok(contacts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactDTO> getContactById(
            @PathVariable Long id) {

        ContactDTO contact = contactService.getContactById(id);

        return ResponseEntity.ok(contact);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactDTO> updateContact(
            @PathVariable Long id,
            @RequestBody ContactDTO contactDTO) {

        ContactDTO updatedContact =
                contactService.updateContact(id, contactDTO);

        return ResponseEntity.ok(updatedContact);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(
            @PathVariable Long id) {

        contactService.deleteContact(id);

        return ResponseEntity.ok("Contact deleted successfully");
    }
}