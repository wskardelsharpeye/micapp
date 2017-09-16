package com.mic.app.service;

import com.mic.app.model.Account;

import java.util.List;

public interface AccountService {

     Account login(String account,String password);

     Account register(Account account);

     List<Account> findAll();

     Account findById(int id);

}
