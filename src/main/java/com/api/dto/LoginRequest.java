package com.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequest {

    @NotBlank(message= "le nom ne doit pas être vide!")
    private String nom;

    @NotBlank(message =  "Le mot de passe ne doit pas être vide!")
    @Size(min = 3, message = "la taille du mot de passe doit être au minimum 3 chiffres!")
    private String mdp;

    public LoginRequest(){super();}

    public LoginRequest(String nom, String mdp){
        this.nom = nom;
        this.mdp = mdp;
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
}
