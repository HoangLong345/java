package com.hivsystem.admin.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hivsystem.admin.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    public List<Doctor> findBySpecialty(String specialty);
}