package com.example.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Department;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Department> create(
            @RequestBody Department department) {

        return new ResponseEntity<>(
                service.save(department),
                HttpStatus.CREATED);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<?> getAll() {

        return ResponseEntity.ok(
                service.findAll());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Department> getById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                service.findById(id));
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Department> update(
            @PathVariable Long id,
            @RequestBody Department department) {

        return ResponseEntity.ok(
                service.update(id, department));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(
            @PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.ok(
                "Department deleted successfully");
    }

    // PAGINATION + SORTING
    @GetMapping("/page")
    public ResponseEntity<Page<Department>> getDepartments(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "departmentId") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        Sort sort;

        if (direction.equalsIgnoreCase("desc")) {
            sort = Sort.by(sortBy).descending();
        } else {
            sort = Sort.by(sortBy).ascending();
        }

        Pageable pageable =
                PageRequest.of(page, size, sort);

        return ResponseEntity.ok(
                service.findAll(pageable));
    }
}