package com.mic.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "maid")
public @Data class Maid {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private int age;

    @Column(name="gender")
    private String gender;

    @Column(name="nationality")
    private String nationality;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;

    @Column(name="expectation_salary")
    private String expectionSalary;

    @Column(name="working_years")
    private int workingYears;

    @Column(name="religion")
    private String religion;

    @Column(name="hobby")
    private String hobby;

    @Column(name="self_introduction")
    private String selfIntroduction;

    //@OneToOne(cascade=CascadeType.ALL)
    //@JoinColumn(name="account_id")
    @Column(name = "account_id")
    private int accountId;

    @Column(name = "education_level")
    private String educationLevel;

    @Column(name = "first_language")
    private String firstLanguage;

    @Column(name = "first_language_level")
    private String firstLanguageLevel;

    @Column(name = "second_language")
    private String secondLanguage;

    @Column(name = "second_language_level")
    private String secondLanguageLevel;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "skype")
    private String skype;

    @Column(name = "wechat")
    private String wechat;

    @Column(name = "email")
    private String email;

    @Column(name = "job_status")
    private String jobStatus;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "active")
    private String active;

    @Column(name = "id_no")
    private String idNo;
}
