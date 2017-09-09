package com.mic.app.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "assistant")
public @Data class Assistant {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

    @Column(name = "name")
   private String name;

    @Column(name = "age")
   private int age;

    @Column(name = "join_date")
   private Date joinDate;

    @Column(name = "resign_date")
    private Date resignDate;

    @Column(name = "gender")
   private String gender;

    @Column(name = "status")
   private String status;

    @Column(name = "account_id")
   private int accountId;

    @Column(name = "create_time")
   private Date createTime;

    @Column(name = "create_by")
   private String createBy;


}
