package com.mic.app.service;

import com.mic.app.model.Employer;

import java.util.List;

public interface EmployerService {

    public List<Employer> findAll();

    public Employer save(Employer employer);

}
