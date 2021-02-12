package com.beautysaloon.service;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.domain.Role;
import com.beautysaloon.dto.EmployeeDTO;
import com.beautysaloon.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    private final PasswordEncoder passwordEncoder;

    public List<Employee> getEmployees(Role role) {
        return employeeRepo.findAllByRole(role);
    }

    public List<Employee> getEmployees() {
        return employeeRepo.findAllByOrderByIdDesc();
    }

    public EmployeeDTO getEmployee(String name, String password) {
        return new EmployeeDTO(employeeRepo.findByNameAndPassword(name, password));
    }

    public void createEmployee(String name, String password, String phone, String email, String role) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setPassword(password);
        employee.setPhone(phone);
        employee.setEmail(email);
        employee.setRole(List.of(Role.valueOf(role.toUpperCase())));
        employeeRepo.save(employee);

    }

}

