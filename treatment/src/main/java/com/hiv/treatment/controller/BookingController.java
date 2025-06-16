@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;
    @GetMapping("/doctors")
    public ResponseEntity<List<Doctor>> getDoctors(@RequestParam(required = false) String specialty) {
        return ResponseEntity.ok(bookingService.getDoctors(specialty));
    }
    
    @PostMapping
    public ResponseEntity<?> bookAppointment(@RequestBody BookingRequest request) {
        try {
            Appointment appointment = bookingService.bookAppointment(
                request.getPatientName(),
                request.getDoctorId(),
                request.getAppointmentTime(),
                request.getReason()
            );
            return ResponseEntity.ok(appointment);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
