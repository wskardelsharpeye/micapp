package com.mic.app.serviceImpl;

import com.mic.app.dao.MaidRepository;
import com.mic.app.model.Maid;
import com.mic.app.service.MaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaidServiceImpl implements MaidService{

    @Autowired
    private MaidRepository maidRepository;

    public List<Maid> findAll() {
        return maidRepository.findAll();
    }

    public Maid save(Maid maid) {
        return maidRepository.save(maid);
    }

    public Maid update(Maid maid) {
        return maidRepository.save(maid);
    }
}
