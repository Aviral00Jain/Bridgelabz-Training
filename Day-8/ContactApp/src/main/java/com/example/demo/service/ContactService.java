package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ContactDTO;

public interface ContactService {

    ContactDTO createContact(ContactDTO contactDTO);

    List<ContactDTO> getAllContacts();

    ContactDTO getContactById(Long id);

    ContactDTO updateContact(Long id, ContactDTO contactDTO);

    void deleteContact(Long id);
}