package com.mic.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "employer")
public @Data class Employer {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "city")
    private String city;

    @Column(name = "gender")
    private String gender;

    @Column(name = "demands")
    private String demands;

    @Column(name ="urgency_level")
    private String urgencyLevel;

    @Column(name = "status")
    private String status;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "active")
    private String active;

    @Column(name = "idcard")
    private String idCard;

    @Column(name = "address")
    private String address;

}
