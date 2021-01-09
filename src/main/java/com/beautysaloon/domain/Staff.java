package com.beautysaloon.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String staffName;
    private String staffNumberTelephone;
    private Role role;

    @OneToMany
    @JoinColumn(name = "staffId")
    private List<Order> orders = new ArrayList<>();

}
