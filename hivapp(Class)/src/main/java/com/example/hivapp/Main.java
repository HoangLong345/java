package com.example;

import com.example.hivapp.pojo.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User u = new User(1L, "patient01", "Nguyen Van A", "a@example.com", "0123456789", Role.CUSTOMER, false);
        Doctor d = new Doctor(u.getId(), "MD", "HIV Specialist", "Mon-Fri");

        Appointment appt = new Appointment(1L, u.getId(), u.getId(), LocalDateTime.now(), "Follow-up", false, AppointmentStatus.CONFIRMED);
        MedicalRecord record = new MedicalRecord(1L, u.getId(), LocalDate.now(), "TDF+3TC+DTG", 500, 100L, "Good progress");
        Notification noti = new Notification(1L, u.getId(), "Reminder: take medication", LocalDateTime.now().plusHours(2), false);

        System.out.println("User: " + u.getFullName() + " - Role: " + u.getRole());
        System.out.println("Doctor Specialization: " + d.getSpecialization());
        System.out.println("Appointment Status: " + appt.getStatus());
        System.out.println("ARV Regimen: " + record.getArvs());
        System.out.println("Notification: " + noti.getMessage());
    }
}