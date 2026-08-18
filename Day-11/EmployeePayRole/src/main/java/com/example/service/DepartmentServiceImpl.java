package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dto.request.DepartmentRequestDTO;
import com.example.dto.response.DepartmentResponseDTO;
import com.example.entity.Department;
import com.example.exception.DepartmentNotFoundException;
import com.example.mapper.DepartmentMapper;
import com.example.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;
    private final DepartmentMapper mapper;

    public DepartmentServiceImpl(
            DepartmentRepository repository,
            DepartmentMapper mapper) {

        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public DepartmentResponseDTO save(
            DepartmentRequestDTO request) {

        Department department =
                mapper.toEntity(request);

        Department savedDepartment =
                repository.save(department);

        return mapper.toResponse(savedDepartment);
    }

    @Override
    public Page<DepartmentResponseDTO> findAll(
            Pageable pageable) {

        return repository.findAll(pageable)
                .map(mapper::toResponse);
    }

    @Override
    public DepartmentResponseDTO findById(Long id) {

        Department department =
                repository.findById(id)
                .orElseThrow(() ->
                        new DepartmentNotFoundException(
                                "Department not found with id: " + id));

        return mapper.toResponse(department);
    }

    @Override
    public DepartmentResponseDTO update(
            Long id,
            DepartmentRequestDTO request) {

        Department department =
                repository.findById(id)
                .orElseThrow(() ->
                        new DepartmentNotFoundException(
                                "Department not found with id: " + id));

        department.setDepartmentName(
                request.getDepartmentName());

        Department updatedDepartment =
                repository.save(department);

        return mapper.toResponse(updatedDepartment);
    }

    @Override
    public void delete(Long id) {

        if (!repository.existsById(id)) {

            throw new DepartmentNotFoundException(
                    "Department not found with id: " + id);
        }

        repository.deleteById(id);
    }
}