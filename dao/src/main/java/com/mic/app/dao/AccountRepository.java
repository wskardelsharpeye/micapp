package com.mic.app.dao;


import com.mic.app.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    public Account findByAccountAndPassword(String account, String password);

    Account findById(int id);

}
