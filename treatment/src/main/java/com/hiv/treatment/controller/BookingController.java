package main.java.com.hiv.treatment.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.hivapp.pojo.Doctor;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService = null;
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

    public BookingService getBookingService() {
        return bookingService;
    }
}
