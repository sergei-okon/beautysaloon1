package com.beautysaloon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

//    @PreAuthorize(value = "hasAnyAuthority('ADMIN') or hasAnyAuthority('MANAGER')") //Дает доступ отдельным пользователям
    @GetMapping("/staff")
    public String forStaff() {
        return "staff";
    }

}
