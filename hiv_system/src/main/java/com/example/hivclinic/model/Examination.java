package com.example.hivclinic.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Examination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate examinationDate;

    private String doctorName;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Examination() {}

    public Examination(LocalDate examinationDate, String doctorName, String notes, Patient patient) {
        this.examinationDate = examinationDate;
        this.doctorName = doctorName;
        this.notes = notes;
        this.patient = patient;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public LocalDate getExaminationDate() { return examinationDate; }

    public void setExaminationDate(LocalDate examinationDate) { this.examinationDate = examinationDate; }

    public String getDoctorName() { return doctorName; }

    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getNotes() { return notes; }

    public void setNotes(String notes) { this.notes = notes; }

    public Patient getPatient() { return patient; }

    public void setPatient(Patient patient) { this.patient = patient; }
}
