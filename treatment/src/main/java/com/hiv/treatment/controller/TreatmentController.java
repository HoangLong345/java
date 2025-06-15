package com.hiv.treatment.controller;

import com.hiv.treatment.model.TreatmentPlan;
import com.hiv.treatment.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/treatment")
@CrossOrigin(origins = "*")
public class TreatmentController {

    @Autowired
    private TreatmentService service;

    @GetMapping("/patient/{id}")
    public List<TreatmentPlan> getByPatient(@PathVariable Long id) {
        return service.getByPatientId(id);
    }

    @PostMapping
    public TreatmentPlan add(@RequestBody TreatmentPlan plan) {
        return service.addTreatmentPlan(plan);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}