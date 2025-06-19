package main.java.com.hiv.treatment.repository;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.hivapp.pojo.Appointment;
import com.hiv.treatment.repository.JpaRepository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    boolean existsByDoctorIdAndAppointmentTime(Long doctorId, LocalDateTime appointmentTime);
}
