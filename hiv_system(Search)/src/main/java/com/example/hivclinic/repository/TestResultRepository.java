package com.example.hivclinic.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hivclinic.model.TestResult;

@Repository
public interface TestResultRepository extends JpaRepository<TestResult, Long> {
    List<TestResult> findByPatientIdAndTestDateBetween(Long patientId, LocalDate from, LocalDate to);
}