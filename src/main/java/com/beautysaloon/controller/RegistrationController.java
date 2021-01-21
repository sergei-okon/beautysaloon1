//package com.beautysaloon.controller;
//
//import com.beautysaloon.domain.Employee;
//import com.beautysaloon.domain.RegistrationRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//
//@Controller
//@RequestMapping("/registration")
//public class RegistrationController {
//
//    @GetMapping
//    public String registration() {
//        return "registration";
//    }
//
//
//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public String registration(Model model) {
//        model.addAttribute("RegistrationFormStaff", new Employee());
//
//        return "registration";
//    }
//
//
//        @PostMapping("/registration")
//        public String processStaff(RegistrationRequest registrationRequest) {
//            staffRepo.save(registrationRequest.toStaff());
//
//            return "redirect:/login";
//
////    @PostMapping("registration")
////    public String addStaff(@ModelAttribute("staff") Staff staff) {
////        staffRepo.save(staff);
////
////        return "redirect:/login";
//    }
//}
//
//
//
//
