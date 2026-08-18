package com.example.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<EmployeeResponseDTO> create(
            @RequestBody EmployeeRequestDTO request) {

        return new ResponseEntity<>(
                service.save(request),
                HttpStatus.CREATED);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> getAll() {

        return ResponseEntity.ok(
                service.findAll());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> getById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                service.findById(id));
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> update(
            @PathVariable Long id,
            @RequestBody EmployeeRequestDTO request) {

        return ResponseEntity.ok(
                service.update(id, request));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(
            @PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.ok(
                "Employee deleted successfully");
    }

    // PAGINATION + SORTING
    @GetMapping("/page")
    public ResponseEntity<Page<EmployeeResponseDTO>> getEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "employeeId") String sortBy,
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

    // QUERY BY EXAMPLE
    @GetMapping("/search")
    public ResponseEntity<List<EmployeeResponseDTO>> search(
            @RequestParam(required = false) String employeeName,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String role) {

        Employee employee = new Employee();

        employee.setEmployeeName(employeeName);
        employee.setEmail(email);
        employee.setRole(role);

        return ResponseEntity.ok(
                service.search(employee));
    }
}