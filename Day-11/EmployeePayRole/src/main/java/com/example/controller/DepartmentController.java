package com.example.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.request.DepartmentRequestDTO;
import com.example.dto.response.DepartmentResponseDTO;
import com.example.service.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/departments")
@Tag(
        name = "Department Management",
        description = "APIs for managing departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(
            DepartmentService service) {

        this.service = service;
    }

    @Operation(
            summary = "Create department",
            description = "Creates a new department.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "201",
                description = "Department created successfully"),
        @ApiResponse(
                responseCode = "400",
                description = "Invalid department data")
    })
    @PostMapping
    public ResponseEntity<DepartmentResponseDTO> create(
            @Valid @RequestBody DepartmentRequestDTO request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.save(request));
    }

    @Operation(
            summary = "Get all departments",
            description = "Returns departments with pagination and sorting.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Departments retrieved successfully")
    })
    @GetMapping
    public ResponseEntity<Page<DepartmentResponseDTO>> getAll(
            @PageableDefault(
                    page = 0,
                    size = 5,
                    sort = "departmentName",
                    direction = Sort.Direction.ASC)
            Pageable pageable) {

        return ResponseEntity.ok(
                service.findAll(pageable));
    }

    @Operation(
            summary = "Get department by ID",
            description = "Retrieves a department using its ID.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Department found"),
        @ApiResponse(
                responseCode = "404",
                description = "Department not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentResponseDTO> getById(
            @Parameter(
                    description = "Department ID",
                    example = "1")
            @PathVariable Long id) {

        return ResponseEntity.ok(
                service.findById(id));
    }

    @Operation(
            summary = "Update department",
            description = "Updates an existing department using its ID.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Department updated successfully"),
        @ApiResponse(
                responseCode = "400",
                description = "Invalid department data"),
        @ApiResponse(
                responseCode = "404",
                description = "Department not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<DepartmentResponseDTO> update(
            @Parameter(
                    description = "Department ID",
                    example = "1")
            @PathVariable Long id,
            @Valid @RequestBody DepartmentRequestDTO request) {

        return ResponseEntity.ok(
                service.update(id, request));
    }

    @Operation(
            summary = "Delete department",
            description = "Deletes a department using its ID.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "204",
                description = "Department deleted successfully"),
        @ApiResponse(
                responseCode = "404",
                description = "Department not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @Parameter(
                    description = "Department ID",
                    example = "1")
            @PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}