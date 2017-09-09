package com.mic.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "job")
public @Data class Job {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "experience")
    private int experience;

    @Column(name = "language_demand")
    private String languageDemand;

    @Column(name = "education_demand")
    private String educationDemand;

    @Column(name ="employer_id")
    private int employerId;

    @Column(name = "status")
    private String status;

}
