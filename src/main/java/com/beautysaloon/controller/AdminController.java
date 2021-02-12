package com.beautysaloon.controller;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.model.RegistrationRequest;
import com.beautysaloon.domain.Role;
import com.beautysaloon.dto.EmployeeDTO;
import com.beautysaloon.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {
    private final EmployeeService employeeService;

    @PostMapping("/admin/registration")
    public String register(RegistrationRequest request) {
        employeeService.createEmployee(
                request.getName(),
                request.getPassword(),
                request.getPhone(),
                request.getEmail(),
                request.getRole()
                );
return "registration";
    }


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
    public String admin() {
        return "admin";
    }

    @GetMapping("/admin/registration")
    public String registration() {
        return "registration";
    }
}
