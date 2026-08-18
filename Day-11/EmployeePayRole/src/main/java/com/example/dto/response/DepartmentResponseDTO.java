package com.example.dto.response;

public class DepartmentResponseDTO {

    private Long departmentId;

    private String departmentName;

    public DepartmentResponseDTO() {
    }

    public DepartmentResponseDTO(
            Long departmentId,
            String departmentName) {

        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}