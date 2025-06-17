@Service
@RequiredArgsConstructor
public class BookingService {
    private final AppointmentRepository appointmentRepo;
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
