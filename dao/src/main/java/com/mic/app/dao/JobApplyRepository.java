package com.mic.app.dao;

import com.mic.app.model.IPGroup;
import com.mic.app.model.JobApply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobApplyRepository extends JpaRepository<JobApply,Long> {


    public List<JobApply> findByMaidId(int maidId);

    public List<JobApply> findByJobId(int jobId);

}
