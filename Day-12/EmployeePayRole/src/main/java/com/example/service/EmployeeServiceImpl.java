package com.example.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dto.request.EmployeeRequestDTO;
import com.example.dto.response.EmployeeResponseDTO;
import com.example.entity.Employee;
import com.example.exception.EmployeeNotFoundException;
import com.example.mapper.EmployeeMapper;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger logger =
            Logger.getLogger(EmployeeServiceImpl.class.getName());

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    public EmployeeServiceImpl(
            EmployeeRepository repository,
            EmployeeMapper mapper) {

        this.repository = repository;
        this.mapper = mapper;

        logger.info("EmployeeServiceImpl initialized");
    }

    @Override
    public EmployeeResponseDTO save(
            EmployeeRequestDTO request) {

        logger.info("Creating new employee");

        Employee employee =
                mapper.toEntity(request);

        Employee savedEmployee =
                repository.save(employee);

        logger.info(
                "Employee created successfully with id: "
                + savedEmployee.getEmployeeId());

        return mapper.toResponse(savedEmployee);
    }

    @Override
    public List<EmployeeResponseDTO> findAll() {

        logger.info("Fetching all employees");

        List<EmployeeResponseDTO> employees =
                repository.findAll()
                        .stream()
                        .map(mapper::toResponse)
                        .toList();

        logger.info(
                "Total employees fetched: "
                + employees.size());

        return employees;
    }

    @Override
    public EmployeeResponseDTO findById(Long id) {

        logger.info(
                "Fetching employee with id: " + id);

        Employee employee =
                repository.findById(id)
                .orElseThrow(() -> {

                    logger.warning(
                            "Employee not found with id: " + id);

                    return new EmployeeNotFoundException(
                            "Employee not found with id: " + id);
                });

        logger.info(
                "Employee found with id: " + id);

        return mapper.toResponse(employee);
    }

    @Override
    public EmployeeResponseDTO update(
            Long id,
            EmployeeRequestDTO request) {

        logger.info(
                "Updating employee with id: " + id);

        Employee employee =
                repository.findById(id)
                .orElseThrow(() -> {

                    logger.warning(
                            "Employee not found for update with id: "
                            + id);

                    return new EmployeeNotFoundException(
                            "Employee not found with id: " + id);
                });

        employee.setEmployeeName(
                request.getEmployeeName());

        employee.setEmail(
                request.getEmail());

        employee.setSalary(
                request.getSalary());

        employee.setRole(
                request.getRole());

        employee.setDepartmentId(
                request.getDepartmentId());

        Employee updatedEmployee =
                repository.save(employee);

        logger.info(
                "Employee updated successfully with id: "
                + id);

        return mapper.toResponse(updatedEmployee);
    }

    @Override
    public void delete(Long id) {

        logger.info(
                "Deleting employee with id: " + id);

        if (!repository.existsById(id)) {

            logger.warning(
                    "Employee not found for deletion with id: "
                    + id);

            throw new EmployeeNotFoundException(
                    "Employee not found with id: " + id);
        }

        repository.deleteById(id);

        logger.info(
                "Employee deleted successfully with id: "
                + id);
    }

    @Override
    public Page<EmployeeResponseDTO> findAll(
            Pageable pageable) {

        logger.info(
                "Fetching employees with pagination");

        Page<EmployeeResponseDTO> employees =
                repository.findAll(pageable)
                        .map(mapper::toResponse);

        logger.info(
                "Employees fetched successfully. Total elements: "
                + employees.getTotalElements());

        return employees;
    }

    @Override
    public List<EmployeeResponseDTO> search(
            Employee employee) {

        logger.info(
                "Searching employees using Query By Example");

        ExampleMatcher matcher =
                ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase();

        Example<Employee> example =
                Example.of(employee, matcher);

        List<EmployeeResponseDTO> result =
                repository.findAll(example)
                        .stream()
                        .map(mapper::toResponse)
                        .toList();

        logger.info(
                "Employee search completed. Results found: "
                + result.size());

        return result;
    }
}