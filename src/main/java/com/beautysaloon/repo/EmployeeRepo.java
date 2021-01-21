package com.beautysaloon.repo;

import com.beautysaloon.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    Employee findByName(String name);

 }

