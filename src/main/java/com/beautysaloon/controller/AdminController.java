package com.beautysaloon.controller;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.domain.Role;
import com.beautysaloon.dto.EmployeeDTO;
import com.beautysaloon.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController {
    private final EmployeeService employeeService;

    @GetMapping("/admin/staff")
    public List<EmployeeDTO> showStaff() {
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();

        List<Employee> employees = employeeService.getEmployees(Role.STAFF);
        for (Employee employee : employees) {
            employeeDTOS.add(new EmployeeDTO(employee));
        }
        return employeeDTOS;
    }

    @GetMapping("/admin")
    public String Admin() {
        return "admin";
    }
}
