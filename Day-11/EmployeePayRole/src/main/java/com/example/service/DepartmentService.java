package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.exception.DepartmentNotFoundException;
import com.example.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Department save(Department department) {
        return repository.save(department);
    }

    // READ ALL
    public List<Department> findAll() {
        return repository.findAll();
    }

    // READ BY ID
    public Department findById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new DepartmentNotFoundException(
                                "Department not found with id: " + id));
    }

    // UPDATE
    public Department update(
            Long id,
            Department department) {

        Department existingDepartment = findById(id);

        existingDepartment.setDepartmentName(
                department.getDepartmentName());

        return repository.save(existingDepartment);
    }

    // DELETE
    public void delete(Long id) {

        if (!repository.existsById(id)) {
            throw new DepartmentNotFoundException(
                    "Department not found with id: " + id);
        }

        repository.deleteById(id);
    }

    // PAGINATION + SORTING
    public Page<Department> findAll(Pageable pageable) {

        return repository.findAll(pageable);
    }
}