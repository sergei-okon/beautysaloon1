package com.beautysaloon.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serviceType;
    private BigDecimal price;

    @OneToMany
    @JoinColumn(name = "serviceId")
    private List<Order> orders = new ArrayList<>();

}
