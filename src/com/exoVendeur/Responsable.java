package com.exoVendeur;

public class Responsable extends Personnel {

    private String telResp;


    public Responsable(String nom, String prenom, String telResp) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.telResp = telResp;
    }

    public void setTelResp(String telResp) {
        this.telResp = telResp;
    }

    public String getTelResp() {
        return telResp;
    }
}




