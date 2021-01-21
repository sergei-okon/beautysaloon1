package com.beautysaloon.controller;

import com.beautysaloon.domain.Employee;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index(@AuthenticationPrincipal Employee employee, Model model) {
        if (employee != null) {
            model.addAttribute("staff", employee.getUsername());
            return "index";
        }
        model.addAttribute("staff", "anonymous");
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PreAuthorize(value = "hasAnyAuthority('ADMIN') or hasAnyAuthority('STAFF')") //Дает доступ отдельным пользователям
    @GetMapping("/forstaff")
    public String forStaff() {
        return "forstaff";
    }

    @GetMapping("/foradmin")
    public String forAdmin() {
        return "foradmin";
    }
}
