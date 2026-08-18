package com.example.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.entity.Employee;
import com.example.exception.EmployeeNotFoundException;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public EmployeeResponseDTO save(EmployeeRequestDTO request) {

        Employee employee = new Employee();

        employee.setEmployeeName(request.getEmployeeName());
        employee.setEmail(request.getEmail());
        employee.setSalary(request.getSalary());
        employee.setRole(request.getRole());
        employee.setDepartmentId(request.getDepartmentId());

        Employee savedEmployee = repository.save(employee);

        return convertToResponse(savedEmployee);
    }

    // READ ALL
    public List<EmployeeResponseDTO> findAll() {

        return repository.findAll()
                .stream()
                .map(this::convertToResponse)
                .toList();
    }

    // READ BY ID
    public EmployeeResponseDTO findById(Long id) {

        Employee employee = repository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found with id: " + id));

        return convertToResponse(employee);
    }

    // UPDATE
    public EmployeeResponseDTO update(
            Long id,
            EmployeeRequestDTO request) {

        Employee employee = repository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found with id: " + id));

        employee.setEmployeeName(request.getEmployeeName());
        employee.setEmail(request.getEmail());
        employee.setSalary(request.getSalary());
        employee.setRole(request.getRole());
        employee.setDepartmentId(request.getDepartmentId());

        Employee updatedEmployee = repository.save(employee);

        return convertToResponse(updatedEmployee);
    }

    // DELETE
    public void delete(Long id) {

        if (!repository.existsById(id)) {
            throw new EmployeeNotFoundException(
                    "Employee not found with id: " + id);
        }

        repository.deleteById(id);
    }

    // PAGINATION + SORTING
    public Page<EmployeeResponseDTO> findAll(Pageable pageable) {

        return repository.findAll(pageable)
                .map(this::convertToResponse);
    }

    // QUERY BY EXAMPLE
    public List<EmployeeResponseDTO> search(Employee employee) {

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase();

        Example<Employee> example =
                Example.of(employee, matcher);

        return repository.findAll(example)
                .stream()
                .map(this::convertToResponse)
                .toList();
    }

    // ENTITY -> RESPONSE DTO
    private EmployeeResponseDTO convertToResponse(
            Employee employee) {

        return new EmployeeResponseDTO(
                employee.getEmployeeId(),
                employee.getEmployeeName(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getRole(),
                employee.getDepartmentId());
    }
}