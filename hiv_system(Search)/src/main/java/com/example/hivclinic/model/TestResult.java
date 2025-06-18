package com.example.hivclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TestResult {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Patient patient;

    private String testType; // ARV, CD4, HIV_VIRAL_LOAD
    private String result;
    private LocalDate testDate;
    private String prescribedRegimen;

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public String getPrescribedRegimen() {
        return prescribedRegimen;
    }

    public void setPrescribedRegimen(String prescribedRegimen) {
        this.prescribedRegimen = prescribedRegimen;
    }
}