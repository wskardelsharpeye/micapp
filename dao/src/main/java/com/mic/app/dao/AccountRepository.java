package com.mic.app.dao;


import com.mic.app.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {

    public Account findByLoginAccountAndPassword(String loginAccount, String password);


}
