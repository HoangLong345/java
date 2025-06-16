package com.example.treatment.admin.model;

import jakarta.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String degree;
    private String workingSchedule;

    // Getters & Setters
    
    
}