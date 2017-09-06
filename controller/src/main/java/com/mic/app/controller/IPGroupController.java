package com.mic.app.controller;

import com.mic.app.model.IPGroup;
import com.mic.app.service.AccountService;
import com.mic.app.service.IPGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ipGroup")
public class IPGroupController {

    @Autowired
    private IPGroupService ipGroupService;

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    public List<IPGroup> findAll() {
        List<IPGroup> aList =  ipGroupService.findAll();
        return aList;
    }


}
