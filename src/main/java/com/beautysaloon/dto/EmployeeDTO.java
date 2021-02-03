package com.beautysaloon.dto;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.domain.Role;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeDTO {
    private Long id;
    private String name;
    private String phone;
    private String email;

    private List<Role> role;

    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.phone = employee.getPhone();
        this.email = employee.getEmail();
        this.role = employee.getRole();
    }
}
