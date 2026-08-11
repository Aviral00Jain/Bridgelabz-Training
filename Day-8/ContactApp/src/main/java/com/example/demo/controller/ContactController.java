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

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // CREATE CONTACT
    @PostMapping
    public ResponseEntity<ContactDTO> createContact(
            @Valid @RequestBody ContactDTO contactDTO) {

        ContactDTO savedContact = contactService.createContact(contactDTO);

        return new ResponseEntity<>(savedContact, HttpStatus.CREATED);
    }

    // GET ALL CONTACTS
    @GetMapping
    public ResponseEntity<List<ContactDTO>> getAllContacts() {

        List<ContactDTO> contacts = contactService.getAllContacts();

        return ResponseEntity.ok(contacts);
    }

    // GET CONTACT BY ID
    @GetMapping("/{id}")
    public ResponseEntity<ContactDTO> getContactById(
            @PathVariable Long id) {

        ContactDTO contact = contactService.getContactById(id);

        return ResponseEntity.ok(contact);
    }

    // UPDATE CONTACT
    @PutMapping("/{id}")
    public ResponseEntity<ContactDTO> updateContact(
            @PathVariable Long id,
            @Valid @RequestBody ContactDTO contactDTO) {

        ContactDTO updatedContact =
                contactService.updateContact(id, contactDTO);

        return ResponseEntity.ok(updatedContact);
    }

    // DELETE CONTACT
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(
            @PathVariable Long id) {

        contactService.deleteContact(id);

        return ResponseEntity.ok("Contact deleted successfully");
    }
}