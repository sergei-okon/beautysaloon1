package com.beautysaloon.repo;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Employee findByName(String name);

    List<Employee> findAllByRole(Role role);

    Employee findByNameAndPassword (String name, String password);
 }

