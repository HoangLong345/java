@Data
public class BookingRequest {
    private String patientName;
    private Long doctorId;
    private LocalDateTime appointmentTime;
    private String reason;
}
