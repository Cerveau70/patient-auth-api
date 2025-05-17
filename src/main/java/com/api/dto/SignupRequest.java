package com.api.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SignupRequest {

    @NotBlank(message = "Le nom ne doit pas être vide!")
    @Column(name = "nomPatient")
    private String nom;

    @NotBlank(message = "Le mot de passe ne doit pas être vide!")
    @Column(name = "motPasse")
    @Size(min = 3, message = "le mot de être au minimum 3 chiffres!")
    private String mdp;

    @NotBlank(message = "Le role ne doit pas être vide!")
    private String role;

    public SignupRequest(){super();}

    public SignupRequest(String nom, String mdp, String role){
        this.nom = nom;
        this.mdp = mdp;
        this.role = role;
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
}
