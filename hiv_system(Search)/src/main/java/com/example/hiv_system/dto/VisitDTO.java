package com.example.hiv_system.dto;

public class VisitDTO {
    private String name;
    private String visitDate;
    private String arvRegimen;
    private int cd4Count;
    private int hivViralLoad;

    public VisitDTO(String name, String visitDate, String arvRegimen, int cd4Count, int hivViralLoad) {
        this.name = name;
        this.visitDate = visitDate;
        this.arvRegimen = arvRegimen;
        this.cd4Count = cd4Count;
        this.hivViralLoad = hivViralLoad;
    }

    // Getters và Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVisitDate() { return visitDate; }
    public void setVisitDate(String visitDate) { this.visitDate = visitDate; }

    public String getArvRegimen() { return arvRegimen; }
    public void setArvRegimen(String arvRegimen) { this.arvRegimen = arvRegimen; }

    public int getCd4Count() { return cd4Count; }
    public void setCd4Count(int cd4Count) { this.cd4Count = cd4Count; }

    public int getHivViralLoad() { return hivViralLoad; }
    public void setHivViralLoad(int hivViralLoad) { this.hivViralLoad = hivViralLoad; }
}
