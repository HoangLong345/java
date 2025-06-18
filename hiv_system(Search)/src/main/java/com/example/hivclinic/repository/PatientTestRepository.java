package com.example.hivclinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hivclinic.model.PatientTest;

@Repository
public interface PatientTestRepository extends JpaRepository<PatientTest, Long> {
    List<PatientTest> findByPatientId(Long patientId);
}
