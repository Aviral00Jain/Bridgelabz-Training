package com.example.service;

import com.example.dto.request.DepartmentRequestDTO;
import com.example.dto.response.DepartmentResponseDTO;
import com.example.entity.Department;
import com.example.exception.DepartmentNotFoundException;
import com.example.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public void save(DepartmentRequestDTO dto) {

        Department department = new Department();

        department.setDepartmentName(dto.getDepartmentName());

        repository.save(department);
    }

    // READ ALL
    public List<DepartmentResponseDTO> findAll() {

        return repository.findAll()
                .stream()
                .map(department ->
                        new DepartmentResponseDTO(
                                department.getDepartmentId(),
                                department.getDepartmentName()
                        )
                )
                .toList();
    }

    // READ BY ID
    public DepartmentResponseDTO findById(int id) {

        try {

            Department department = repository.findById(id);

            return new DepartmentResponseDTO(
                    department.getDepartmentId(),
                    department.getDepartmentName()
            );

        } catch (Exception e) {

            throw new DepartmentNotFoundException(
                    "Department not found with id: " + id
            );
        }
    }

    // UPDATE
    public void update(int id, DepartmentRequestDTO dto) {

        findById(id);

        Department department = new Department();

        department.setDepartmentName(dto.getDepartmentName());

        repository.update(id, department);
    }

    // DELETE
    public void delete(int id) {

        findById(id);

        repository.delete(id);
    }
}