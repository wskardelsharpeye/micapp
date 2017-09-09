package com.mic.app.controller;

import com.mic.app.model.Interview;
import com.mic.app.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

import java.util.List;

@RestController
@RequestMapping(value = "/interview")
public class InterviewController {

    @Autowired
    private InterviewService interviewService;


    @RequestMapping(value = "/findAll" ,method = RequestMethod.GET)
    public List<Interview> findAll(){
        return interviewService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Interview save(@RequestBody Interview interview) {
        return interviewService.save(interview);
    }
}
