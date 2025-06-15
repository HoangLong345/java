package com.example.hivapp.pojo;

import javax.persistence.*;
import com.example.hivapp.enums.AppointmentStatus;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "appointment_time")
    private LocalDateTime appointmentTime;
    
    private String reason;
    private boolean anonymous;
    private AppointmentStatus status;

    public Appointment() {}

    public Appointment(Long id, Long userId, Long doctorId, LocalDateTime appointmentTime, String reason, boolean anonymous, AppointmentStatus status) {
        this.id = id;
        this.userId = userId;
        this.doctorId = doctorId;
        this.appointmentTime = appointmentTime;
        this.reason = reason;
        this.anonymous = anonymous;
        this.status = status;
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

    public AppointmentStatus getStatus() {return status;}
    public void setStatus(AppointmentStatus status) {this.status = status;}
}
