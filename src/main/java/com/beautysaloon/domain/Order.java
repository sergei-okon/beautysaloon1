package com.beautysaloon.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
//@AllArgsConstructor //создать конструктор для всех полей класса
//@NoArgsConstructor //
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   // @NotNull
    private LocalDate data;

    //@NotNull
    private LocalDateTime time;

  //  @NotNull
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "staffId")
    private Staff staff;

  //  @NotNull
    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Service service;

   // @NotNull
    private BigDecimal price;
}

