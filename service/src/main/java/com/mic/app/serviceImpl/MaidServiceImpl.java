package com.mic.app.serviceImpl;

import com.mic.app.dao.AccountRepository;
import com.mic.app.dao.MaidRepository;
import com.mic.app.model.Account;
import com.mic.app.model.Maid;
import com.mic.app.service.MaidService;
import com.mic.app.utils.MicRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaidServiceImpl implements MaidService{

    @Autowired
    private MaidRepository maidRepository;

    @Autowired
    private AccountRepository accountRepository;

    public List<Maid> findAll() {
        return maidRepository.findAll();
    }

    public Maid save(Maid maid) {
        return maidRepository.save(maid);
    }

    public Maid update(Maid maid) {
        return maidRepository.save(maid);
    }

    public Maid saveProfile(Maid maid) {
        //1.update account role
        Account account = accountRepository.findById(maid.getAccountId());
        account.setRole(MicRole.CANDIDATE.toString());
        accountRepository.save(account);
        //2.save maid info
        return this.save(maid);

    }
}
