package com.mic.app.service;

import com.mic.app.model.Interview;

import java.util.List;

public interface InterviewService {

    public List<Interview> findAll();

    public Interview save(Interview interview);



}
