package com.beautysaloon.model;

import lombok.Data;
import java.lang.String;


@Data
public class RegistrationRequest {

    private String name;
    private String password;
    private String phone;
    private String email;
    private String role;

}
