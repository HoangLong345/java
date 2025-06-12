package com.example.hivapp.pojo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "medical_records")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "visit_date")
    private LocalDate visitDate;

    private String arvs;

    @Column(name = "cd4_count")
    private Integer cd4Count;

    @Column(name = "viral_load")
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
