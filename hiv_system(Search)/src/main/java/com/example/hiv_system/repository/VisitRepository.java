package com.example.hiv_system.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hiv_system.entity.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long> {
    @EntityGraph(attributePaths = "patient")
    List<Visit> findByPatient_PatientIdAndVisitDateBetween(Long patientId, LocalDate from, LocalDate to);
}
