package com.example.hivclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hivclinic.model.ARVRegimen;

@Repository
public interface ARVRegimenRepository extends JpaRepository<ARVRegimen, Long> {
}
