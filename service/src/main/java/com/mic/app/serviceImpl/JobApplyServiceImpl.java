package com.mic.app.serviceImpl;

import com.mic.app.dao.JobApplyRepository;
import com.mic.app.model.JobApply;
import com.mic.app.service.JobApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplyServiceImpl implements JobApplyService{

    @Autowired
    private JobApplyRepository jobApplyRepository;

    public List<JobApply> findAll() {
        return jobApplyRepository.findAll();
    }

    public JobApply save(JobApply jobApply) {
        return jobApplyRepository.save(jobApply);
    }

    public List<JobApply> findByMaidId(int maidId) {
        return jobApplyRepository.findByMaidId(maidId);
    }

    public List<JobApply> findByJobId(int jobId) {
        return null;
    }
}
