package com.mic.app.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

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


    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {

        return ID;
    }
}