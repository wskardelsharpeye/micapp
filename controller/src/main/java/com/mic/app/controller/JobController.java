package com.mic.app.controller;

import com.mic.app.model.Job;
import com.mic.app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Job> findAll() {
        return jobService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Job save(@RequestBody Job job) {
        return jobService.save(job);
    }
}
