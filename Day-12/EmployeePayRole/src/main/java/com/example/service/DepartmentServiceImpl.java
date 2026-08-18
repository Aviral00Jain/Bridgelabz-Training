package com.example.service;

import java.util.logging.Logger;

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

    private static final Logger logger =
            Logger.getLogger(DepartmentServiceImpl.class.getName());

    private final DepartmentRepository repository;
    private final DepartmentMapper mapper;

    public DepartmentServiceImpl(
            DepartmentRepository repository,
            DepartmentMapper mapper) {

        this.repository = repository;
        this.mapper = mapper;

        logger.info("DepartmentServiceImpl initialized");
    }

    @Override
    public DepartmentResponseDTO save(
            DepartmentRequestDTO request) {

        logger.info("Creating new department");

        Department department =
                mapper.toEntity(request);

        Department savedDepartment =
                repository.save(department);

        logger.info(
                "Department created successfully with id: "
                + savedDepartment.getDepartmentId());

        return mapper.toResponse(savedDepartment);
    }

    @Override
    public Page<DepartmentResponseDTO> findAll(
            Pageable pageable) {

        logger.info(
                "Fetching departments with pagination");

        Page<DepartmentResponseDTO> departments =
                repository.findAll(pageable)
                        .map(mapper::toResponse);

        logger.info(
                "Departments fetched successfully. Total elements: "
                + departments.getTotalElements());

        return departments;
    }

    @Override
    public DepartmentResponseDTO findById(Long id) {

        logger.info(
                "Fetching department with id: " + id);

        Department department =
                repository.findById(id)
                .orElseThrow(() -> {

                    logger.warning(
                            "Department not found with id: " + id);

                    return new DepartmentNotFoundException(
                            "Department not found with id: " + id);
                });

        logger.info(
                "Department found with id: " + id);

        return mapper.toResponse(department);
    }

    @Override
    public DepartmentResponseDTO update(
            Long id,
            DepartmentRequestDTO request) {

        logger.info(
                "Updating department with id: " + id);

        Department department =
                repository.findById(id)
                .orElseThrow(() -> {

                    logger.warning(
                            "Department not found for update with id: "
                            + id);

                    return new DepartmentNotFoundException(
                            "Department not found with id: " + id);
                });

        department.setDepartmentName(
                request.getDepartmentName());

        Department updatedDepartment =
                repository.save(department);

        logger.info(
                "Department updated successfully with id: "
                + id);

        return mapper.toResponse(updatedDepartment);
    }

    @Override
    public void delete(Long id) {

        logger.info(
                "Deleting department with id: " + id);

        if (!repository.existsById(id)) {

            logger.warning(
                    "Department not found for deletion with id: "
                    + id);

            throw new DepartmentNotFoundException(
                    "Department not found with id: " + id);
        }

        repository.deleteById(id);

        logger.info(
                "Department deleted successfully with id: "
                + id);
    }
}