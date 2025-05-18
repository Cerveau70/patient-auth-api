package com.api.service;

import com.api.model.DossPatient;
import com.api.repository.DossPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DossPatientService {

    private final DossPatientRepository dpr;

    public DossPatientService(DossPatientRepository dpr) {
        this.dpr = dpr;
    }

    public DossPatient save(DossPatient dp){
        return dpr.save(dp);
    }

    public List<DossPatient> getAll(){
        return dpr.findAll();
    }

    public DossPatient getById(Long id){
        return dpr.findById(id).orElse(null);
    }

    public DossPatient update(Long id, DossPatient ndp){
        DossPatient existing = dpr.findById(id)
                .orElseThrow(() -> new RuntimeException("Dossier non trouvéavec ID: " + id));

                existing.setPatient(ndp.getPatient());
                existing.setAge(ndp.getAge());
                existing.setNumero(ndp.getNumero());
                existing.setPoids(ndp.getPoids());
                existing.setPathologie(ndp.getPathologie());
                return dpr.save(existing);
    }

    public void delete(Long id){
        dpr.deleteById(id);
    }
}
