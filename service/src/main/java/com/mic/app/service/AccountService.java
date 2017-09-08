package com.mic.app.service;

import com.mic.app.model.Account;

import java.util.List;

public interface AccountService {

     Account login(Account account);

     Account register(Account account);

     List<Account> findAll();

}
