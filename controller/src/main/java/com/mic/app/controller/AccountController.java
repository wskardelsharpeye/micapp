package com.mic.app.controller;


import com.mic.app.service.AccountService;
import com.mic.app.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public Account register(@RequestBody Account account) {
        return accountService.register(account);
    }

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public Account login(@RequestParam(value = "account") String account,
                          @RequestParam(value = "password") String password) {
        Account aAccount = accountService.login(account,password);
        if(null == aAccount) return new Account();
        else return aAccount;
    }

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public List<Account> login() {
        return accountService.findAll();
    }

}
