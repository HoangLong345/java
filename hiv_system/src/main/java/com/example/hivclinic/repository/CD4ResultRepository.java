package com.example.hivclinic.repository;

import com.example.hivclinic.model.CD4Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CD4ResultRepository extends JpaRepository<CD4Result, Long> {
}
