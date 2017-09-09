package com.mic.app.controller;

import com.mic.app.model.JobApply;
import com.mic.app.service.JobApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/jobApply")
public class JobApplyController {

    @Autowired
    private JobApplyService jobApplyService;

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public List<JobApply> findAll(){
        return jobApplyService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public JobApply save(@RequestBody JobApply jobApply) {
        return jobApplyService.save(jobApply);
    }

    @RequestMapping(value ="/findByMaidId", method = RequestMethod.GET)
    public List<JobApply> findByMaidId(int maidId) {
        return jobApplyService.findByMaidId(maidId);
    }

    @RequestMapping(value ="/findByJobId", method = RequestMethod.GET)
    public List<JobApply> findByJobId(int jobId) {
        return jobApplyService.findByJobId(jobId);
    }
}
