package com.hivsystem.admin.model;

import java.util.Map;

public class User {
    private long totalPatients;
    private long totalDoctors;
    private long totalAppointments;
    private Map<String, Long> appointmentsByDay;

    // Getters/Setters
    public long getTotalPatients() {
        return totalPatients;
    }
    public void setTotalPatients(long totalPatients) {
        this.totalPatients = totalPatients;
    }

    public long getTotalDoctors() {
        return totalDoctors;
    }
    public void setTotalDoctors(long totalDoctors) {
        this.totalDoctors = totalDoctors;
    }

    public long getTotalAppointments() {
        return totalAppointments;
    }
    public void setTotalAppointments(long totalAppointments) {
        this.totalAppointments = totalAppointments;
    }

    public Map<String, Long> getAppointmentsByDay() {
        return appointmentsByDay;
    }
    public void setAppointmentsByDay(Map<String, Long> appointmentsByDay) {
        this.appointmentsByDay = appointmentsByDay;
    }
}