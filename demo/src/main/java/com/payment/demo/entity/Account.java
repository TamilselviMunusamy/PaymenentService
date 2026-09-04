package com.payment.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="iban",nullable = false,unique = true)
    private String iban;
    @Column(name = "balance", nullable = false)
    private double balance;
    @Column(name ="currency")
    private String currency;


}
