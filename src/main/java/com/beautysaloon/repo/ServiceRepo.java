package com.beautysaloon.repo;

import com.beautysaloon.domain.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Service, Long> {
    Service findByServiceType(String serviceType);
}
