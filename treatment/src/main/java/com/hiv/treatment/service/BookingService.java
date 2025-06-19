package main.java.com.hiv.treatment.service;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.hivapp.pojo.Appointment;
import com.example.hivapp.pojo.Doctor;
import com.hivsystem.admin.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final AppointmentRepository appointmentRepo = null;
    private final DoctorRepository doctorRepo;

    public List<Doctor> getDoctors(String specialty) {
        if (specialty != null && !specialty.isBlank()) {
            return doctorRepo.findBySpecialty(specialty);
        }
        return doctorRepo.findAll();
    }

    public Appointment bookAppointment(String patientName, Long doctorId, LocalDateTime appointmentTime, String reason) {
        if (appointmentRepo.existsByDoctorIdAndAppointmentTime(doctorId, appointmentTime)) {
            throw new IllegalArgumentException("Bác sĩ đã có lịch hẹn vào thời gian này!");
        }

        Doctor doctor = doctorRepo.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy bác sĩ"));

        Appointment appointment = new Appointment();
        appointment.setPatientName(patientName);
        appointment.setDoctor(doctor);
        appointment.setAppointmentTime(appointmentTime);
        appointment.setReason(reason);

        return appointmentRepo.save(appointment);
    }
}
