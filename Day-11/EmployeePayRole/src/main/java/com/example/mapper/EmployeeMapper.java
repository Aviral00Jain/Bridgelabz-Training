package com.example.mapper;

import org.springframework.stereotype.Component;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.entity.Employee;

@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeRequestDTO request) {

        Employee employee = new Employee();

        employee.setEmployeeName(request.getEmployeeName());
        employee.setEmail(request.getEmail());
        employee.setSalary(request.getSalary());
        employee.setRole(request.getRole());
        employee.setDepartmentId(request.getDepartmentId());

        return employee;
    }

    public EmployeeResponseDTO toResponse(Employee employee) {

        return new EmployeeResponseDTO(
                employee.getEmployeeId(),
                employee.getEmployeeName(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getRole(),
                employee.getDepartmentId());
    }
}