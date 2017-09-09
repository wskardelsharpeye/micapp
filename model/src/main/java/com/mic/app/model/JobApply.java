package com.mic.app.model;

import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "job_apply")
public @Data class JobApply {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "maid_id")
    private int maidId;

    @Column(name = "job_id")
    private int jobId;

    @Column(name = "create_time")
    private Date createTime;




}
