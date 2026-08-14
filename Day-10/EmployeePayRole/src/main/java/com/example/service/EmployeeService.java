package com.example.service;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.entity.Employee;
import com.example.exception.EmployeeNotFoundException;
import com.example.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public void save(EmployeeRequestDTO dto) {

        Employee employee = new Employee();

        employee.setEmployeeName(dto.getEmployeeName());
        employee.setEmail(dto.getEmail());
        employee.setSalary(dto.getSalary());
        employee.setRole(dto.getRole());
        employee.setDepartmentId(dto.getDepartmentId());

        repository.save(employee);
    }

    // READ ALL
    public List<EmployeeResponseDTO> findAll() {

        return repository.findAll()
                .stream()
                .map(employee ->
                        new EmployeeResponseDTO(
                                employee.getEmployeeId(),
                                employee.getEmployeeName(),
                                employee.getEmail(),
                                employee.getSalary(),
                                employee.getRole(),
                                employee.getDepartmentId()
                        )
                )
                .toList();
    }

    // READ BY ID
    public EmployeeResponseDTO findById(int id) {

        try {

            Employee employee = repository.findById(id);

            return new EmployeeResponseDTO(
                    employee.getEmployeeId(),
                    employee.getEmployeeName(),
                    employee.getEmail(),
                    employee.getSalary(),
                    employee.getRole(),
                    employee.getDepartmentId()
            );

        } catch (Exception e) {

            throw new EmployeeNotFoundException(
                    "Employee not found with id: " + id
            );
        }
    }

    // UPDATE
    public void update(int id, EmployeeRequestDTO dto) {

        findById(id);

        Employee employee = new Employee();

        employee.setEmployeeName(dto.getEmployeeName());
        employee.setEmail(dto.getEmail());
        employee.setSalary(dto.getSalary());
        employee.setRole(dto.getRole());
        employee.setDepartmentId(dto.getDepartmentId());

        repository.update(id, employee);
    }

    // DELETE
    public void delete(int id) {

        findById(id);

        repository.delete(id);
    }
}