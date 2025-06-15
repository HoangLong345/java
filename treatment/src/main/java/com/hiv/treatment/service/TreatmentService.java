package com.hiv.treatment.service;

import com.hiv.treatment.model.TreatmentPlan;
import com.hiv.treatment.repository.TreatmentPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TreatmentService {

    @Autowired
    private TreatmentPlanRepository repository;

    public List<TreatmentPlan> getByPatientId(Long patientId) {
        return repository.findByPatientId(patientId);
    }

    public TreatmentPlan addTreatmentPlan(TreatmentPlan plan) {
        return repository.save(plan);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
