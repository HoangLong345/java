package com.example.hivapp;

import com.example.hivapp.dao.*;
import com.example.hivapp.enums.AppointmentStatus;
import com.example.hivapp.enums.Role;
import com.example.hivapp.pojo.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo user và lưu
        User user = new User(1L, "patient01", "Nguyen Van A", "a@example.com", "0123456789", Role.CUSTOMER, false);
        UserDAO userDAO = new UserDAO("JPAs");
        userDAO.save(user);
        // Tạo doctor và lưu
        Doctor doctor = new Doctor(user.getId(), "MD", "HIV Specialist", "Mon-Fri");
        DoctorDAO doctorDAO = new DoctorDAO("JPAs");
        doctorDAO.save(doctor);

        // Tạo appointment và lưu
        Appointment appt = new Appointment(1L, user.getId(), user.getId(), LocalDateTime.now(), "Follow-up", false, AppointmentStatus.CONFIRMED);
        AppointmentDAO apptDAO = new AppointmentDAO("JPAs");
        apptDAO.save(appt);

        // Tạo medical record và lưu
        MedicalRecord record = new MedicalRecord(1L, user.getId(), LocalDate.now(), "TDF+3TC+DTG", 500, 100L, "Good progress");
        MedicalRecordDAO recordDAO = new MedicalRecordDAO("JPAs");
        recordDAO.save(record);

        // Tạo notification và lưu
        Notification noti = new Notification(1L, user.getId(), "Reminder: take medication", LocalDateTime.now().plusHours(2), false);
        NotificationDAO notiDAO = new NotificationDAO("JPAs");
        notiDAO.save(noti);

        // Tìm và in thông tin từng loại
        System.out.println("--- USER ---");
        System.out.println(userDAO.findById(1L));

        System.out.println("--- DOCTOR ---");
        System.out.println(doctorDAO.findById(user.getId()));

        System.out.println("--- APPOINTMENT ---");
        System.out.println(apptDAO.findById(1L));

        System.out.println("--- MEDICAL RECORD ---");
        System.out.println(recordDAO.findById(1L));

        System.out.println("--- NOTIFICATION ---");
        System.out.println(notiDAO.findById(1L));

        // In danh sách tất cả
        System.out.println("\n--- ALL USERS ---");
        List<User> users = userDAO.findAll();
        users.forEach(System.out::println);

        System.out.println("\n--- ALL APPOINTMENTS ---");
        List<Appointment> appts = apptDAO.findAll();
        appts.forEach(System.out::println);
    }
}
