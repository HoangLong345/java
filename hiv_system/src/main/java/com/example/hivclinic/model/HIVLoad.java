package com.example.hivclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HIVLoad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer viralLoad;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public HIVLoad() {}

    public HIVLoad(Integer viralLoad, LocalDate date, Patient patient) {
        this.viralLoad = viralLoad;
        this.date = date;
        this.patient = patient;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public Integer getViralLoad() { return viralLoad; }

    public void setViralLoad(Integer viralLoad) { this.viralLoad = viralLoad; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public Patient getPatient() { return patient; }

    public void setPatient(Patient patient) { this.patient = patient; }
}
