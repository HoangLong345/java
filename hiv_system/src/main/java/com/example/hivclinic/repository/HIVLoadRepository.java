package com.example.hivclinic.repository;

import com.example.hivclinic.model.HIVLoad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HIVLoadRepository extends JpaRepository<HIVLoad, Long> {
}
