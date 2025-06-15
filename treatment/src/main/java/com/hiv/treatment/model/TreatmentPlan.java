package com.hiv.treatment.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TreatmentPlan {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String regimen;
    private String notes;
    private LocalDate startDate;
    private LocalDate endDate;

    private Long patientId; 

}
