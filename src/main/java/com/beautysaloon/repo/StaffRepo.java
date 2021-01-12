package com.beautysaloon.repo;

import com.beautysaloon.domain.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepo extends CrudRepository<Staff, Long> {
    Staff findByStaffName(String name);
}
