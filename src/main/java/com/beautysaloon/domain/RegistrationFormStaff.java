package com.beautysaloon.domain;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Collections;

@Data
public class RegistrationFormStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String phone;
    private String email;

    public Staff toStaff(PasswordEncoder passwordEncoder) {
        Staff staff = new Staff();
        staff.setEmail(email);
        staff.setPassword(passwordEncoder.encode(password));
        staff.setPhone(phone);
        staff.setStaffName(name);
        staff.setRole(Collections.singleton(Role.STAFF));

        return staff;
    }

}
