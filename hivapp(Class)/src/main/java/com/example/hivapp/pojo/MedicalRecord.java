package com.example.hivapp.pojo;

import java.time.LocalDate;

public class MedicalRecord {
    private Long id;
    private Long userId;
    private LocalDate visitDate;
    private String arvs;
    private Integer cd4Count;
    private Long viralLoad;
    private String notes;

    public MedicalRecord() {}

    public MedicalRecord(Long id, Long userId, LocalDate visitDate, String arvs, Integer cd4Count, Long viralLoad, String notes) {
        this.id = id;
        this.userId = userId;
        this.visitDate = visitDate;
        this.arvs = arvs;
        this.cd4Count = cd4Count;
        this.viralLoad = viralLoad;
        this.notes = notes;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Long getUserId() {return userId;}
    public void setUserId(Long userId) {this.userId = userId;}

    public LocalDate getVisitDate() {return visitDate;}
    public void setVisitDate(LocalDate visitDate) {this.visitDate = visitDate;}

    public String getArvs() {return arvs;}
    public void setArvs(String arvs) {this.arvs = arvs;}

    public Integer getCd4Count() {return cd4Count;}
    public void setCd4Count(Integer cd4Count) {this.cd4Count = cd4Count;}

    public Long getViralLoad() {return viralLoad;}
    public void setViralLoad(Long viralLoad) {this.viralLoad = viralLoad;}

    public String getNotes() {return notes;}
    public void setNotes(String notes) {this.notes = notes;}
}
