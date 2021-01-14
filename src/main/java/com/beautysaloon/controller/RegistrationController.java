package com.beautysaloon.controller;

import com.beautysaloon.domain.RegistrationFormStaff;
import com.beautysaloon.repo.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private StaffRepo staffRepo;

    @GetMapping
    public String registration() {
        return "registration";
    }

    @PostMapping
    public String processStaff(RegistrationFormStaff form) {
        staffRepo.save(form.toStaff(passwordEncoder));
        return "redirect:/login";

    }

}
