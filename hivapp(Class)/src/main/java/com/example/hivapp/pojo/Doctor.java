package com.example.hivapp.pojo;

public class Doctor {
    private Long userId;
    private String degree;
    private String specialization;
    private String workingSchedule;

    public Doctor() {}

    public Doctor(Long userId, String degree, String specialization, String workingSchedule) {
        this.userId = userId;
        this.degree = degree;
        this.specialization = specialization;
        this.workingSchedule = workingSchedule;
    }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getWorkingSchedule() { return workingSchedule; }
    public void setWorkingSchedule(String workingSchedule) { this.workingSchedule = workingSchedule; }
}
