package com.example.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
@Tag(
        name = "Employee Management",
        description = "APIs for managing employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(
            EmployeeService service) {

        this.service = service;
    }

    @Operation(
            summary = "Create employee",
            description = "Creates a new employee.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "201",
                description = "Employee created successfully"),
        @ApiResponse(
                responseCode = "400",
                description = "Invalid employee data")
    })
    @PostMapping
    public ResponseEntity<EmployeeResponseDTO> create(
            @Valid @RequestBody EmployeeRequestDTO request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.save(request));
    }

    @Operation(
            summary = "Get all employees",
            description = "Returns all employees.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Employees retrieved successfully")
    })
    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> getAll() {

        return ResponseEntity.ok(
                service.findAll());
    }

    @Operation(
            summary = "Get employees with pagination",
            description = "Returns employees with pagination and sorting.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Employees retrieved successfully")
    })
    @GetMapping("/page")
    public ResponseEntity<Page<EmployeeResponseDTO>> getEmployees(
            @Parameter(
                    description = "Page number",
                    example = "0")
            @RequestParam(defaultValue = "0") int page,

            @Parameter(
                    description = "Number of records per page",
                    example = "5")
            @RequestParam(defaultValue = "5") int size,

            @Parameter(
                    description = "Field used for sorting",
                    example = "employeeName")
            @RequestParam(
                    defaultValue = "employeeId")
            String sortBy,

            @Parameter(
                    description = "Sorting direction",
                    example = "asc")
            @RequestParam(
                    defaultValue = "asc")
            String direction) {

        Sort sort;

        if (direction.equalsIgnoreCase("desc")) {
            sort = Sort.by(sortBy).descending();
        } else {
            sort = Sort.by(sortBy).ascending();
        }

        Pageable pageable =
                org.springframework.data.domain.PageRequest
                        .of(page, size, sort);

        return ResponseEntity.ok(
                service.findAll(pageable));
    }

    @Operation(
            summary = "Get employee by ID",
            description = "Retrieves an employee using its ID.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Employee found"),
        @ApiResponse(
                responseCode = "404",
                description = "Employee not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> getById(
            @Parameter(
                    description = "Employee ID",
                    example = "1")
            @PathVariable Long id) {

        return ResponseEntity.ok(
                service.findById(id));
    }

    @Operation(
            summary = "Update employee",
            description = "Updates an existing employee using its ID.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Employee updated successfully"),
        @ApiResponse(
                responseCode = "400",
                description = "Invalid employee data"),
        @ApiResponse(
                responseCode = "404",
                description = "Employee not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> update(
            @Parameter(
                    description = "Employee ID",
                    example = "1")
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequestDTO request) {

        return ResponseEntity.ok(
                service.update(id, request));
    }

    @Operation(
            summary = "Delete employee",
            description = "Deletes an employee using its ID.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "204",
                description = "Employee deleted successfully"),
        @ApiResponse(
                responseCode = "404",
                description = "Employee not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @Parameter(
                    description = "Employee ID",
                    example = "1")
            @PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();
    }

    @Operation(
            summary = "Search employees",
            description = "Searches employees using employee name, email or role.")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Search completed successfully")
    })
    @GetMapping("/search")
    public ResponseEntity<List<EmployeeResponseDTO>> search(

            @Parameter(
                    description = "Employee name",
                    example = "Saksham")
            @RequestParam(required = false)
            String employeeName,

            @Parameter(
                    description = "Employee email",
                    example = "saksham@gmail.com")
            @RequestParam(required = false)
            String email,

            @Parameter(
                    description = "Employee role",
                    example = "Developer")
            @RequestParam(required = false)
            String role) {

        Employee employee = new Employee();

        employee.setEmployeeName(employeeName);
        employee.setEmail(email);
        employee.setRole(role);

        return ResponseEntity.ok(
                service.search(employee));
    }
}