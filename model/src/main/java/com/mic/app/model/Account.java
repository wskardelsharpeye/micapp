package com.mic.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account")
public @Data class Account {

    public Account() {
    }

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name="account")
    private String account;

    @Column(name="password")
    private String password;

    @Column(name="role")
    private String role;

}