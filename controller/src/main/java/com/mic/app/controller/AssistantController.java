package com.mic.app.controller;

import com.mic.app.model.Assistant;
import com.mic.app.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/assistant")
public class AssistantController {
    @Autowired
    private AssistantService assistantService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Assistant> findAll() {
        return assistantService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Assistant save(@RequestBody Assistant assistant) {
        return assistantService.save(assistant);
    }

}
