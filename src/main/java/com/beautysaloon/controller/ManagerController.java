package com.beautysaloon.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {

//    @PreAuthorize(value = "hasAnyAuthority('ADMIN') or hasAnyAuthority('MANAGER')") //Дает доступ отдельным пользователям
    @GetMapping("/manager")
    public String forStaff() {
        return "manager";
    }

}
