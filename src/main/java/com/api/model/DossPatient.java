package com.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="dossier_patient" )
public class DossPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dossier_patientId", updatable = false, nullable = false)
    private Long id;

    @NotBlank(message = "le nom est obligatoire")
    @Column(name = "nom_patient")
    private String nom;

    @NotBlank(message = "le prenom est obligatoire")
    @Column(name = "prenom_patient")
    private String prenom;

    @Min(value = 0, message = "l'âge ne peut pas être inférieure à 0")
    @Column(name = "age_patient")
    private int age;

    @Min(value = 0, message = "Le poids ne peut pas être inférieure à 0")
    @Column(name ="poids_patient")
    private int poids;

    @NotBlank(message = "le numero est obligatoire")
    @Column(name = "numero")
    private String numero;

    @NotBlank(message = "la pathologie est obligatoire")
    @Column(name = "pathologie_patient")
    private String pathologie;

    public DossPatient(){
        super();
    }

    public DossPatient(Long id, String nom, String prenom, int age, int poids, String numero, String pathologie ){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.poids = poids;
        this.numero = numero;
        this.pathologie = pathologie;
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

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getPoids(){
        return poids;
    }

    public void setPoids(int poids){
        this.poids = poids;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getPathologie(){
        return pathologie;
    }

    public void setPathologie(String pathologie){
        this.pathologie = pathologie;
    }

    @Override
    public String toString(){
        return "Le dossier du patient: "+ getNom() +" "+getPrenom()+"qui souffre de : "
                +getPathologie()+"pour un poids de " + getPoids()+" "+"et "+getAge()+" "+"ans";
    }

}
