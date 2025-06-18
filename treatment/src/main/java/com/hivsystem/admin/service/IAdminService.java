package com.hivsystem.admin.service;

import java.time.LocalDate;
import java.util.List;

import com.hivsystem.admin.model.Doctor;
import com.hivsystem.admin.model.User;

public interface IAdminService {
    List<User> getAllUsers();
    List<Doctor> getAllDoctors();
    long countPatientsByDate(LocalDate date);
}