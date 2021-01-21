package com.beautysaloon.service;

import com.beautysaloon.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StaffDetailService implements UserDetailsService {
    
    @Autowired
    private EmployeeRepo employeeRepo;
    
    @Override
    public UserDetails loadUserByUsername(String staffName) throws UsernameNotFoundException {
        return employeeRepo.findByName(staffName);
    }
}
