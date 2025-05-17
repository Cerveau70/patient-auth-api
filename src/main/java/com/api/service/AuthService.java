package com.api.service;

import com.api.dto.LoginRequest;
import com.api.dto.SignupRequest;
import com.api.model.Patient;
import com.api.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final PatientRepository patientRepository;

    public AuthService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public String signup(SignupRequest request){
        if (patientRepository.findByNom(request.getNom()).isPresent()){
            throw new RuntimeException("Ce nom à déjà été utiliser pour un inscription");
        }

        Patient patient = new Patient();

        patient.setNom(request.getNom());
        patient.setMdp(request.getMdp());
        patient.setRole(request.getRole());

        patientRepository.save(patient);
        return "Inscription réussir!";
    }

    public String login(LoginRequest request){

        Patient patient = patientRepository.findByNom(request.getNom())
                .orElseThrow(()->new RuntimeException("Utilisateurntrouvable"));

        if (!patient.getMdp().equals(request.getMdp())){
            throw new RuntimeException("Mot de passe introuvable");
        }

        return "connexion réussir!";
    }
}
