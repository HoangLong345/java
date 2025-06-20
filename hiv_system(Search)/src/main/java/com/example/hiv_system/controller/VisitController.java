package com.example.hiv_system.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hiv_system.dto.VisitDTO;
import com.example.hiv_system.entity.Visit;
import com.example.hiv_system.repository.VisitRepository;

@RestController
@RequestMapping("/api/visits")
@CrossOrigin(origins = "*")
public class VisitController {

    private final VisitRepository visitRepository;

    public VisitController(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @GetMapping("/search")
    public List<VisitDTO> searchVisits(
            @RequestParam Long patientId,
            @RequestParam String fromDate,
            @RequestParam String toDate
    ) {
        LocalDate from = LocalDate.parse(fromDate);
        LocalDate to = LocalDate.parse(toDate);
        System.out.println("Tra cứu từ " + from + " đến " + to);

        List<Visit> visits = visitRepository.findByPatient_PatientIdAndVisitDateBetween(patientId, from, to);
        
        for (Visit v : visits) {
            System.out.println("✅ " + v.getVisitDate() + " - " + v.getPatient().getName());
        }

        return visits.stream().map(v ->
            new VisitDTO(
                v.getPatient().getName(),
                v.getVisitDate().toString(),
                v.getArvRegimen(),
                v.getCd4Count(),
                v.getHivViralLoad()
            )
        ).toList();
    }
}
