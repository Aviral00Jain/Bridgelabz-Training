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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import com.example.demo.dto.ContactRequestDTO;
import com.example.demo.dto.ContactResponseDTO;
import com.example.demo.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    // Constructor Injection
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<ContactResponseDTO> createContact(
            @Valid @RequestBody ContactRequestDTO requestDTO) {

        ContactResponseDTO response =
                contactService.createContact(requestDTO);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<ContactResponseDTO>> getAllContacts() {

        List<ContactResponseDTO> contacts =
                contactService.getAllContacts();

        return ResponseEntity.ok(contacts);
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> getContactById(
            @PathVariable Long id) {

        ContactResponseDTO response =
                contactService.getContactById(id);

        return ResponseEntity.ok(response);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> updateContact(
            @PathVariable Long id,
            @Valid @RequestBody ContactRequestDTO requestDTO) {

        ContactResponseDTO response =
                contactService.updateContact(id, requestDTO);

        return ResponseEntity.ok(response);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(
            @PathVariable Long id) {

        contactService.deleteContact(id);

        return ResponseEntity.ok(
                "Contact deleted successfully");
    }

    // SEARCH BY NAME
    @GetMapping("/search/name")
    public ResponseEntity<List<ContactResponseDTO>> searchByName(
            @RequestParam String name) {

        List<ContactResponseDTO> contacts =
                contactService.searchByName(name);

        return ResponseEntity.ok(contacts);
    }

    // SEARCH BY PHONE
    @GetMapping("/search/phone")
    public ResponseEntity<ContactResponseDTO> searchByPhone(
            @RequestParam String phone) {

        ContactResponseDTO response =
                contactService.searchByPhone(phone);

        return ResponseEntity.ok(response);
    }
}