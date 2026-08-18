package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.entity.Employee;

public interface EmployeeService {

    EmployeeResponseDTO save(EmployeeRequestDTO request);

    List<EmployeeResponseDTO> findAll();

    EmployeeResponseDTO findById(Long id);

    EmployeeResponseDTO update(
            Long id,
            EmployeeRequestDTO request);

    void delete(Long id);

    Page<EmployeeResponseDTO> findAll(Pageable pageable);

    List<EmployeeResponseDTO> search(Employee employee);
}