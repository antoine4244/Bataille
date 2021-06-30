package com.exoVendeur;

import java.text.DecimalFormat;

public class Vendeur extends Personnel{

    private int age;
    private String adresse;
    private int salaire;
    private Responsable responsable;
    private Ticket ticket;

    public Vendeur(String nom, String prenom, int age, String adresse, int salaire, Responsable responsable) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.age = age;
        this.adresse = adresse;
        this.salaire = salaire;
        this.responsable = responsable;

    }

    public void createTicket(Ticket){
        ticket = new Ticket();
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }

    public DecimalFormat getSalaire() {
        return salaire;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setSalaire(DecimalFormat salaire) {
        this.salaire = salaire;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
}

