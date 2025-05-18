package com.api.controller;

import com.api.model.DossPatient;
import com.api.service.DossPatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patientsDocs")
public class DossPatientController {

    private final DossPatientService dps;

    public DossPatientController(DossPatientService dps){
        this.dps = dps;
    }

    @PostMapping
    public ResponseEntity<DossPatient> createPatient(@Valid @RequestBody DossPatient dp){
        return ResponseEntity.ok(dps.save(dp));
    }

    @GetMapping
    public List<DossPatient> getAll(){
        return dps.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DossPatient> getById(@PathVariable Long id){
        DossPatient p = dps.getById(id);
        return (p != null) ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public DossPatient update(@PathVariable Long id,@Valid @RequestBody DossPatient ndp){

        return dps.update(id, ndp);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        dps.delete(id);
        return ResponseEntity.noContent().build();
    }


}
