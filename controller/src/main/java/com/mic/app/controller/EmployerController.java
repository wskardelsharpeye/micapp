package com.mic.app.controller;

import com.mic.app.model.Employer;
import com.mic.app.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employer")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Employer> findAll() {
        return employerService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Employer save(@RequestBody Employer employer) {
        return employerService.save(employer);
    }

}
