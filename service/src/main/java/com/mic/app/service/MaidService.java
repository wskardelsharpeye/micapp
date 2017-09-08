package com.mic.app.service;

import com.mic.app.model.Maid;

import java.util.List;

public interface MaidService {

    public List<Maid> findAll();

    public Maid save(Maid maid);

    public Maid update(Maid maid);
}
