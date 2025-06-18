package com.example.hivclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hivclinic.model.MedicalHistory;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
