package com.mic.app.serviceImpl;

import com.mic.app.dao.IPGroupRepository;
import com.mic.app.model.IPGroup;
import com.mic.app.service.IPGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPGroupServiceImpl implements IPGroupService {

    @Autowired
    private IPGroupRepository ipGroupRepository;

    public List<IPGroup> findAll() {
        return ipGroupRepository.findAll();
    }
}
