package com.mic.app.serviceImpl;

import com.mic.app.dao.EmployerRepository;
import com.mic.app.model.Employer;
import com.mic.app.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    public List<Employer> findAll() {
        return employerRepository.findAll();
    }

    public Employer save(Employer employer) {
        return employerRepository.save(employer);
    }
}
