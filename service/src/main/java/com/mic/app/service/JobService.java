package com.mic.app.service;

import com.mic.app.model.Job;

import java.util.List;

public interface JobService {

    public List<Job> findAll();

    public Job save(Job job);
}
