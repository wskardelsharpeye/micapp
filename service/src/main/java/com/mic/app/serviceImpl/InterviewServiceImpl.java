package com.mic.app.serviceImpl;

import com.mic.app.dao.InterviewRepository;
import com.mic.app.model.Interview;
import com.mic.app.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;

    public List<Interview> findAll() {
        return interviewRepository.findAll();
    }

    public Interview save(Interview interview) {
        return interviewRepository.save(interview);
    }
}
