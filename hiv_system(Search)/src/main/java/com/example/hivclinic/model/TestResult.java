package com.example.hivclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String testType;
    private String resultValue;
    private LocalDate testDate;
    private String patientName;

    public TestResult() {}

    public TestResult(Long id, String testType, String resultValue, LocalDate testDate, String patientName) {
        this.id = id;
        this.testType = testType;
        this.resultValue = resultValue;
        this.testDate = testDate;
        this.patientName = patientName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTestType() { return testType; }
    public void setTestType(String testType) { this.testType = testType; }

    public String getResultValue() { return resultValue; }
    public void setResultValue(String resultValue) { this.resultValue = resultValue; }

    public LocalDate getTestDate() { return testDate; }
    public void setTestDate(LocalDate testDate) { this.testDate = testDate; }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
}
