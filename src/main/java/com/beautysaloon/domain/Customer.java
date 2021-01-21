package com.beautysaloon.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long phoneNumber;
    private String email;

    @OneToMany
    @JoinColumn(name = "customerId")
    private List<Order> orders = new ArrayList<>();

//
//    // Валидация почты
//    static Pattern emailPattern = Pattern.compile("[a-zA-Z0-9[!#$%&'()*+,/\\-_\\.\"]]+@[a-zA-Z0-9[!#$%&'()*+,/\\-_\"]]+\\.[a-zA-Z0-9[!#$%&'()*+,/\\-_\"\\.]]+");
//    public static boolean isValidEmail(String email)
//    {
//        Matcher m = emailPattern.matcher(email);
//        return !m.matches();
//    }



}
