package com.beautysaloon.controller;


import com.beautysaloon.domain.Role;
import com.beautysaloon.dto.EmployeeDTO;
import com.beautysaloon.model.LoginRequest;
import com.beautysaloon.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class AuthController {


    private final EmployeeService employeeService;

    @GetMapping("/")
    public String auth() {
        return "auth";
    }


//    @PreAuthorize(value = "hasAnyAuthority('ADMIN') or hasAnyAuthority('STAFF')") //Дает доступ отдельным пользователям
//    @GetMapping("/staff")
//    public String staff() {
//        return "staff";
//    }
//
//    @PreAuthorize(value = "hasAnyAuthority('ADMIN') or hasAnyAuthority('MANAGER')")
//    @GetMapping("/manager")
//    public String manager() {
//        return "manager";
//    }

    @PostMapping("/auth")
    public void login(HttpServletResponse response, LoginRequest loginRequest) throws IOException {

        EmployeeDTO employee = employeeService.getEmployee(loginRequest.getName(), loginRequest.getPassword());
        if (employee.getRole().contains(Role.ADMIN)) {
            response.sendRedirect("admin");

        }
        if (employee.getRole().contains(Role.STAFF)) {
            response.sendRedirect("staff");
        }
        if (employee.getRole().contains(Role.MANAGER)) {
            response.sendRedirect("manager");
        }
    }
}

