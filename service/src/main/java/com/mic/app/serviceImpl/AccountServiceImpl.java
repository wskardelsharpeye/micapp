package com.mic.app.serviceImpl;

import com.mic.app.dao.AccountRepository;
import com.mic.app.service.AccountService;
import com.mic.app.model.Account;
import com.mic.app.utils.MicRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account login(String account,String password) {
        return accountRepository.findByAccountAndPassword(account,password);
    }

    public Account register(Account account) {
        //set defualt role
        account.setRole(MicRole.NEWCOMER.toString());
        return accountRepository.save(account);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findById(int id) {
       return accountRepository.findById(id);
    }
}
