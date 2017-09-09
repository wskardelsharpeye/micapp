package com.mic.app.serviceImpl;

import com.mic.app.dao.AssistantRepository;
import com.mic.app.model.Assistant;
import com.mic.app.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistantServiceImpl implements AssistantService{

    @Autowired
    private AssistantRepository assistantRepository;

    public List<Assistant> findAll() {
        return assistantRepository.findAll();
    }

    public Assistant save(Assistant assistant) {
        return assistantRepository.save(assistant);
    }
}
