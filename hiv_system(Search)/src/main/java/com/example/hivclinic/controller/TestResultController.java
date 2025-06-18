package com.example.hivclinic.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hivclinic.model.TestResult;
import com.example.hivclinic.service.TestResultService;

@RestController
@RequestMapping("/api/test-results")
public class TestResultController {
    @Autowired
    private TestResultService service;

    @GetMapping("/{patientId}")
    public List<TestResult> getResults(
            @PathVariable Long patientId,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {

        if (from == null) from = LocalDate.of(2000, 1, 1);
        if (to == null) to = LocalDate.now();
        return service.getPatientResults(patientId, from, to);
    }
}