package com.example.dto.response;

public class EmployeeResponseDTO {

    private Long employeeId;
    private String employeeName;
    private String email;
    private Long salary;
    private String role;
    private Long departmentId;

    public EmployeeResponseDTO() {
    }

    public EmployeeResponseDTO(Long employeeId,
                               String employeeName,
                               String email,
                               Long salary,
                               String role,
                               Long departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.salary = salary;
        this.role = role;
        this.departmentId = departmentId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}