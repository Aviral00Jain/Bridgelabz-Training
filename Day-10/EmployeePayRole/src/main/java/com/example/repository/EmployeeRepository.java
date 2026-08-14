package com.example.repository;

import com.example.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // CREATE
    public int save(Employee employee) {

        String sql =
                "INSERT INTO employee " +
                "(employee_name, email, salary, role, department_id) " +
                "VALUES (?, ?, ?, ?, ?)";

        return jdbcTemplate.update(
                sql,
                employee.getEmployeeName(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getRole(),
                employee.getDepartmentId()
        );
    }

    // READ ALL
    public List<Employee> findAll() {

        String sql = "SELECT * FROM employee";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Employee(
                        rs.getInt("employee_id"),
                        rs.getString("employee_name"),
                        rs.getString("email"),
                        rs.getDouble("salary"),
                        rs.getString("role"),
                        rs.getInt("department_id")
                )
        );
    }

    // READ BY ID
    public Employee findById(int id) {

        String sql =
                "SELECT * FROM employee WHERE employee_id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                (rs, rowNum) ->
                        new Employee(
                                rs.getInt("employee_id"),
                                rs.getString("employee_name"),
                                rs.getString("email"),
                                rs.getDouble("salary"),
                                rs.getString("role"),
                                rs.getInt("department_id")
                        ),
                id
        );
    }

    // UPDATE
    public int update(int id, Employee employee) {

        String sql =
                "UPDATE employee SET " +
                "employee_name = ?, " +
                "email = ?, " +
                "salary = ?, " +
                "role = ?, " +
                "department_id = ? " +
                "WHERE employee_id = ?";

        return jdbcTemplate.update(
                sql,
                employee.getEmployeeName(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getRole(),
                employee.getDepartmentId(),
                id
        );
    }

    // DELETE
    public int delete(int id) {

        String sql =
                "DELETE FROM employee WHERE employee_id = ?";

        return jdbcTemplate.update(sql, id);
    }
}