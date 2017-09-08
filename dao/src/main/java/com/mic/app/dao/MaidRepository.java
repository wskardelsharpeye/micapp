package com.mic.app.dao;

import com.mic.app.model.Maid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaidRepository extends JpaRepository<Maid,Long> {

}
