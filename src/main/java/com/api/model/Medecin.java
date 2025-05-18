package com.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name  = "Medecin")
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedcin")
    private Long id;

    @NotBlank
    @Column(name="nomMedecin")
    private String nom;

    @NotBlank
    @Column(name="specialiteMedecin")
    private String specialite;

    @NotBlank
    @Column(name="emailMedecin")
    @Email(message = "Le format de mail est invalide!")
    private String email;

    @NotBlank
    @Column(name="telMedecin")
    @Size(min = 10, max= 10 ,message="Le numéro doit être exactement 10 chiffres!" )
    private String telephone;

    @NotBlank
    @Column(name="addMedecin")
    private String adresse;

    @NotBlank
    @Column(name="gradeMedecin")
    private String grade;

    private LocalDate dateInscription;

    public Medecin(){}

    public Medecin(Long id, String nom, String spe, String email, String tel, String add, String grade, LocalDate dateIns){
        this.id = id;
        this.nom = nom;
        this.specialite = spe;
        this.email = email;
        this.telephone = tel;
        this.adresse = add;
        this.grade = grade;
        this.dateInscription = dateIns;
    }

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id =id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getSpecialite(){
        return specialite;
    }

    public void setSpecialite(String spe){
        this.specialite = spe;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String tel){
        this.telephone = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public LocalDate getDateInscription(){
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateIns){
        this.dateInscription = dateIns;
    }

    @PrePersist
    protected void onCreate() {
        this.dateInscription = LocalDate.now();
    }

}
