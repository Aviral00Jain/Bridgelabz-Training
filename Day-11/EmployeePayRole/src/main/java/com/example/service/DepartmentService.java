package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.dto.request.DepartmentRequestDTO;
import com.example.dto.response.DepartmentResponseDTO;

public interface DepartmentService {

    DepartmentResponseDTO save(DepartmentRequestDTO request);

    Page<DepartmentResponseDTO> findAll(Pageable pageable);

    DepartmentResponseDTO findById(Long id);

    DepartmentResponseDTO update(
            Long id,
            DepartmentRequestDTO request);

    void delete(Long id);
}