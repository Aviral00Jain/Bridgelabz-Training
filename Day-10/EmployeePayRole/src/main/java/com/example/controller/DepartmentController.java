package com.example.controller;

import com.example.dto.request.DepartmentRequestDTO;
import com.example.dto.response.DepartmentResponseDTO;
import com.example.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public String save(@RequestBody DepartmentRequestDTO dto) {

        service.save(dto);

        return "Department created successfully";
    }

    // READ ALL
    @GetMapping
    public List<DepartmentResponseDTO> findAll() {

        return service.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public DepartmentResponseDTO findById(@PathVariable int id) {

        return service.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public String update(
            @PathVariable int id,
            @RequestBody DepartmentRequestDTO dto) {

        service.update(id, dto);

        return "Department updated successfully";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {

        service.delete(id);

        return "Department deleted successfully";
    }
}