package com.example.hiv_system.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long visitId;

    private LocalDate visitDate;
    private String arvRegimen;
    @Column(name = "cd4_count")
    private int cd4Count;
    @Column(name = "hiv_viral_load")
    private int hivViralLoad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", referencedColumnName = "patientId")
    private Patient patient;

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getArvRegimen() {
        return arvRegimen;
    }

    public void setArvRegimen(String arvRegimen) {
        this.arvRegimen = arvRegimen;
    }

    public int getCd4Count() {
        return cd4Count;
    }

    public void setCd4Count(int cd4Count) {
        this.cd4Count = cd4Count;
    }

    public int getHivViralLoad() {
        return hivViralLoad;
    }

    public void setHivViralLoad(int hivViralLoad) {
        this.hivViralLoad = hivViralLoad;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Getters & setters
}
