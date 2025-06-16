package com.example.hivclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CD4Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cd4Count;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public CD4Result() {}

    public CD4Result(Integer cd4Count, LocalDate date, Patient patient) {
        this.cd4Count = cd4Count;
        this.date = date;
        this.patient = patient;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public Integer getCd4Count() { return cd4Count; }

    public void setCd4Count(Integer cd4Count) { this.cd4Count = cd4Count; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public Patient getPatient() { return patient; }

    public void setPatient(Patient patient) { this.patient = patient; }
}
