package com.mic.app.service;

import com.mic.app.model.JobApply;

import java.util.List;

public interface JobApplyService {

    public List<JobApply> findAll();

    public JobApply save(JobApply jobApply);

    public List<JobApply> findByMaidId(int maidId);

    public List<JobApply> findByJobId(int jobId);

}
