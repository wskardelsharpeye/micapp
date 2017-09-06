package com.mic.app.dao;

import com.mic.app.model.Account;
import com.mic.app.model.IPGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPGroupRepository extends JpaRepository<IPGroup,Long> {

}
