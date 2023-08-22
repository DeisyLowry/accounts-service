package com.ttrc.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name= "account")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="UserId")
    private String userid;

    @Column(name="AccountName")
    private String accountname;

    @Column(name="AccountType")
    private String accounttype;

    @Column(name="BrokerName")
    private String brokername;

    @Column(name="AccountBalance")
    private String accountbalance;

    @Column(name="Description")
    private String description;

    @Column(name="IsActive")
    private Integer isactive;
}


