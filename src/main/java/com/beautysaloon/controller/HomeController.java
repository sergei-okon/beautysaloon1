package com.beautysaloon.controller;

import com.beautysaloon.domain.Staff;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index(@AuthenticationPrincipal Staff staff, Model model) {
        if (staff != null) {
            model.addAttribute("staff", staff.getUsername());
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
        return "foruser";
    }

    @GetMapping("/foradmin")
    public String forAdmin() {
        return "foradmin";
    }
}
