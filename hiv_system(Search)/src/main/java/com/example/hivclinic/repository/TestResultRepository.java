package com.example.hivclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hivclinic.model.TestResult;

public interface TestResultRepository extends JpaRepository<TestResult, Long> {
}
