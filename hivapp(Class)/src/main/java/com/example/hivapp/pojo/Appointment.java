package com.example.hivapp.pojo;

import java.time.LocalDateTime;

public class Appointment {
    private Long id;
    private Long userId;
    private Long doctorId;
    private LocalDateTime appointmentTime;
    private String reason;
    private boolean anonymous;

    public Appointment() {}

    public Appointment(Long id, Long userId, Long doctorId, LocalDateTime appointmentTime, String reason, boolean anonymous) {
        this.id = id;
        this.userId = userId;
        this.doctorId = doctorId;
        this.appointmentTime = appointmentTime;
        this.reason = reason;
        this.anonymous = anonymous;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Long getUserId() {return userId;}
    public void setUserId(Long userId) {this.userId = userId;}

    public Long getDoctorId() {return doctorId;}
    public void setDoctorId(Long doctorId) {this.doctorId = doctorId;}

    public LocalDateTime getAppointmentTime() {return appointmentTime;}
    public void setAppointmentTime(LocalDateTime appointmentTime) {this.appointmentTime = appointmentTime;}

    public String getReason() {return reason;}
    public void setReason(String reason) {this.reason = reason;}

    public boolean isAnonymous() {return anonymous;}
    public void setAnonymous(boolean anonymous) {this.anonymous = anonymous;}
}
