package com.hiv.treatment.repository;

import com.hiv.treatment.model.TreatmentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TreatmentPlanRepository extends JpaRepository<TreatmentPlan, Long> {
    List<TreatmentPlan> findByPatientId(Long patientId);

    void deleteById(Long id);

    TreatmentPlan save(TreatmentPlan plan);
}