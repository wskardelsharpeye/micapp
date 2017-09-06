package com.mic.app.serviceImpl;

import com.mic.app.dao.AccountRepository;
import com.mic.app.service.AccountService;
import com.mic.app.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account login(Account account) {
        return accountRepository.findByAccountAndPassword(account.getAccount(),account.getPassword());
    }

    public Account register(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
