package com.example.hivclinic.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hivclinic.model.TestResult;
import com.example.hivclinic.repository.TestResultRepository;

@Service
public class TestResultService {
    @Autowired
    private TestResultRepository testResultRepository;

    public List<TestResult> getPatientResults(Long patientId, LocalDate from, LocalDate to) {
        return testResultRepository.findByPatientIdAndTestDateBetween(patientId, from, to);
    }
}
