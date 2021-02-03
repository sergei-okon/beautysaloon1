package com.beautysaloon.service;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.domain.Role;
import com.beautysaloon.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public List<Employee> getEmployees(Role role) {
        return employeeRepo.findAllByRole(role);
    }
}

