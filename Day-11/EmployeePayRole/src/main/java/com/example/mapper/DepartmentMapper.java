package com.example.mapper;

import org.springframework.stereotype.Component;

import com.example.dto.request.DepartmentRequestDTO;
import com.example.dto.response.DepartmentResponseDTO;
import com.example.entity.Department;

@Component
public class DepartmentMapper {

    public Department toEntity(DepartmentRequestDTO request) {

        Department department = new Department();

        department.setDepartmentName(
                request.getDepartmentName());

        return department;
    }

    public DepartmentResponseDTO toResponse(Department department) {

        return new DepartmentResponseDTO(
                department.getDepartmentId(),
                department.getDepartmentName());
    }
}