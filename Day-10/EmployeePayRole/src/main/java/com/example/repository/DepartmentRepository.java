package com.example.repository;

import com.example.entity.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository {

    private final JdbcTemplate jdbcTemplate;

    public DepartmentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // CREATE
    public int save(Department department) {

        String sql =
                "INSERT INTO department (department_name) VALUES (?)";

        return jdbcTemplate.update(
                sql,
                department.getDepartmentName()
        );
    }

    // READ ALL
    public List<Department> findAll() {

        String sql = "SELECT * FROM department";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Department(
                        rs.getInt("department_id"),
                        rs.getString("department_name")
                )
        );
    }

    // READ BY ID
    public Department findById(int id) {

        String sql =
                "SELECT * FROM department WHERE department_id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                (rs, rowNum) ->
                        new Department(
                                rs.getInt("department_id"),
                                rs.getString("department_name")
                        ),
                id
        );
    }

    // UPDATE
    public int update(int id, Department department) {

        String sql =
                "UPDATE department SET department_name = ? " +
                "WHERE department_id = ?";

        return jdbcTemplate.update(
                sql,
                department.getDepartmentName(),
                id
        );
    }

    // DELETE
    public int delete(int id) {

        String sql =
                "DELETE FROM department WHERE department_id = ?";

        return jdbcTemplate.update(sql, id);
    }
}