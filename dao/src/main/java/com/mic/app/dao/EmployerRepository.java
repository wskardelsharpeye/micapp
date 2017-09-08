package com.mic.app.dao;

import com.mic.app.model.Account;
import com.mic.app.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer,Long> {

}
