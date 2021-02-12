package com.beautysaloon.controller;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.dto.EmployeeDTO;
import com.beautysaloon.model.RegistrationRequest;
import com.beautysaloon.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {
    private final EmployeeService employeeService;

    //Выводит список сотрудников
    @GetMapping("/admin/employee")
    public String showEmployee(Model model) {
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();

        List<Employee> employees = employeeService.getEmployees();
        for (Employee employee : employees) {
            employeeDTOS.add(new EmployeeDTO(employee));
        }
        model.addAttribute("employeeList", employeeDTOS);
        return "admin-panel-employee";
    }

    // Обрабатывает данные для для регистрации нового осотрудника
    @PostMapping("/admin/registration")
    public String register(RegistrationRequest request) {
        employeeService.createEmployee(
                request.getName(),
                request.getPassword(),
                request.getPhone(),
                request.getEmail(),
                request.getRole()
        );
        return "admin-panel-employee";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
