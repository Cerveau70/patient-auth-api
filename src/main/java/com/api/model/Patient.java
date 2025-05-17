package com.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "patientID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "nomPatient")
    @NotBlank(message = "Le nom ne doit pas être vide")
    private String nom;

    @Column(name = "patientPWD")
    @Size(min = 3, message = "le mot doit depasser les 3 chiffre au minimum!")
    private String mdp;

    @Column(name = "rolePatient")
    @NotBlank(message = "Le rôle ne doit pas être vide")
    private String role;

    public Patient(){super();}

    public Patient(Long id, String nom, String mdp, String role){
        this.id = id;
        this.nom = nom;
        this.mdp = mdp;
        this.role = role;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getMdp(){
        return mdp;
    }

    public void setMdp(String mdp){
        this.mdp = mdp;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    @Override
    public String toString(){
        return "L'utilisateur: "+nom+"ç pour rôle: "+role;
    }

}
