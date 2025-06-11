package com.example.hivapp.pojo;

import java.time.LocalDateTime;

public class Notification {
    private Long id;
    private Long userId;
    private String message;
    private LocalDateTime notifyTime;
    private boolean readStatus;

    public Notification() {}

    public Notification(Long id, Long userId, String message, LocalDateTime notifyTime, boolean readStatus) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.notifyTime = notifyTime;
        this.readStatus = readStatus;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Long getUserId() {return userId;}
    public void setUserId(Long userId) {this.userId = userId;}

    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

    public LocalDateTime getNotifyTime() {return notifyTime;}
    public void setNotifyTime(LocalDateTime notifyTime) {this.notifyTime = notifyTime;}

    public boolean isReadStatus() {return readStatus;}
    public void setReadStatus(boolean readStatus) {this.readStatus = readStatus;}
}
