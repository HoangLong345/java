package main.java.com.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BookingRequest {
    private String patientName;
    private Long doctorId;
    private LocalDateTime appointmentTime;
    private String reason;
}
