package com.beautysaloon.repo;

import com.beautysaloon.domain.Employee;
import com.beautysaloon.domain.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    Employee findByName(String name);
    List<Employee> findAllByRole(Role role);
 }

