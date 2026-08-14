package com.example.controller;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public String save(@RequestBody EmployeeRequestDTO dto) {

        service.save(dto);

        return "Employee created successfully";
    }

    // READ ALL
    @GetMapping
    public List<EmployeeResponseDTO> findAll() {

        return service.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public EmployeeResponseDTO findById(@PathVariable int id) {

        return service.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public String update(
            @PathVariable int id,
            @RequestBody EmployeeRequestDTO dto) {

        service.update(id, dto);

        return "Employee updated successfully";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {

        service.delete(id);

        return "Employee deleted successfully";
    }
}