package com.beautysaloon.service;

import com.beautysaloon.domain.Service;
import com.beautysaloon.repo.ServiceRepo;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceService {
    private final ServiceRepo serviceRepo;

    public void createService(String serviceType, BigDecimal price) {
        Service service = new Service();
        service.setServiceType(serviceType);
        service.setPrice(price);

        serviceRepo.save(service);
    }

    public List<Service> getServices() {
        return serviceRepo.findAll();
    }
}
