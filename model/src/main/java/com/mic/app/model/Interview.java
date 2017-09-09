package com.mic.app.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "interview")
public @Data class Interview {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "plan_time")
    private Date planTime;

    @Column(name = "channel")
    private String channel;

    @Column(name = "result")
    private String result;

    /**
     * 1.under planning
     * 2.arranged
     * 3.finished
     * 4.expired
     */
    @Column(name = "status")
    private String status;

    @Column(name = "maid_id")
    private int maidId;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "assistant_id")
    private int assistantId;

    /**
     * 1.wechat
     * 2.alipay
     * 3.cash
     * 4.bank card
     */
    @Column(name = "pay_channel")
    private String payChannel;

    @Column(name = "interview_no")
    private String interviewNo;

}
