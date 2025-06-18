package com.example.hivclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ARVRegimen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String regimen;
    private LocalDate startDate;
    private LocalDate endDate;

    // Quan hệ với bệnh nhân (nếu đã có entity Patient)
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public ARVRegimen() {}

    public ARVRegimen(Long id, String regimen, LocalDate startDate, LocalDate endDate, Patient patient) {
        this.id = id;
        this.regimen = regimen;
        this.startDate = startDate;
        this.endDate = endDate;
        this.patient = patient;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRegimen() { return regimen; }
    public void setRegimen(String regimen) { this.regimen = regimen; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }
}
