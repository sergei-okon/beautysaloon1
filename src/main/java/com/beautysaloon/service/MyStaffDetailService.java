package com.beautysaloon.service;

import com.beautysaloon.repo.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyStaffDetailService implements UserDetailsService {
    
    @Autowired
    private StaffRepo staffRepo;
    
    @Override
    public UserDetails loadUserByUsername(String staffName) throws UsernameNotFoundException {
        return staffRepo.findByStaffName(staffName);
    }
}
