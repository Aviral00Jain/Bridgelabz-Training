package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ContactRequestDTO;
import com.example.demo.dto.ContactResponseDTO;

public interface ContactService {

    ContactResponseDTO createContact(ContactRequestDTO requestDTO);

    List<ContactResponseDTO> getAllContacts();

    ContactResponseDTO getContactById(Long id);

    ContactResponseDTO updateContact(Long id, ContactRequestDTO requestDTO);

    void deleteContact(Long id);

    List<ContactResponseDTO> searchByName(String name);

    ContactResponseDTO searchByPhone(String phone);
}