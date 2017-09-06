package com.mic.app.controller;


import com.mic.app.service.AccountService;
import com.mic.app.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public Account register(@ModelAttribute Account account) {
        return accountService.register(account);
    }

    @RequestMapping(value = "login" , method = RequestMethod.GET)
    public Account login(@ModelAttribute Account account) {
        return accountService.login(account);
    }

    @RequestMapping(value = "test" , method = RequestMethod.GET)
    public List<Account> login() {
        return accountService.findAll();
    }

}
