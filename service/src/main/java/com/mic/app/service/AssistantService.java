package com.mic.app.service;

import com.mic.app.model.Assistant;

import java.util.List;

public interface AssistantService {

    public List<Assistant> findAll();

    public Assistant save(Assistant assistant);

}
