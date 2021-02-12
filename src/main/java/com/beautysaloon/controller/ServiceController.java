package com.beautysaloon.controller;

import com.beautysaloon.domain.Service;
import com.beautysaloon.model.CreateServiceRequest;
import com.beautysaloon.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ServiceController {

    private final ServiceService serviceService;

// Показывает список услуг
    @GetMapping("/panel-service")
    public String showServices(Model model) {

        List<Service> services = serviceService.getServices();

        model.addAttribute("serviceList", services);
        return "panel-service";
    }

//Обрабатывает данные для создания новой услуги для сохранения
        @PostMapping("/manager/service")
    public String createService(CreateServiceRequest request, Model model) {
        serviceService.createService(
                request.getServiceType(),
                request.getPrice()
        );

        return showServices(model);
    }

    @GetMapping("/manager")
    public String forStaff() {
        return "manager";
    }

}
