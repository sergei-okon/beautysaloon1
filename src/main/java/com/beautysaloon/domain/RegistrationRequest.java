package com.beautysaloon.domain;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Collections;
import java.lang.String;


@Data
public class RegistrationRequest {

    private Long id;
    private String name;
    private String password;
    private String phone;
    private String email;




}
