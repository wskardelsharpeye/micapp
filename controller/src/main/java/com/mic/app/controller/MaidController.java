package com.mic.app.controller;

import com.mic.app.dto.MaidDTO;
import com.mic.app.model.Maid;
import com.mic.app.service.MaidService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/maid")
public class MaidController {

    @Autowired
    private MaidService maidService;

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public List<Maid> findAll() {
        return maidService.findAll();
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public Maid save(@RequestBody Maid maid) {
        return maidService.save(maid);
    }
}
