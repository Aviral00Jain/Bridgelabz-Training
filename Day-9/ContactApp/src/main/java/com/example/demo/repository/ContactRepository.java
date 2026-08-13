package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    // Search contacts by name
    List<Contact> findByNameContainingIgnoreCase(String name);

    // Find contact by phone number
    Optional<Contact> findByPhone(String phone);
}