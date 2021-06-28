package com.example;

import java.util.Random;

public class Joueur {

    /* ***** Attributs ********/
    private String nom = "test";
    private int[] jeuDeCartes = new int[13];
    /* ***** Méthodes ********/
    public void initJeuCartes()
    {
        for(int i=0; i<jeuDeCartes.length;i++)
        {
            jeuDeCartes[i] = i+1; // [0] = 1 'As' [1] = 2 ...
        }
    }
    public int tirerUneCarte()
    {
        Random lRand = new Random();
        int lIndexAlea = lRand.nextInt(jeuDeCartes.length);
        return jeuDeCartes[lIndexAlea];
    }

    // getters and setters

    public int[] getJeuDeCartes(){
        return jeuDeCartes;
    }
    public void setJeuDeCartes(int[] value){
        this.jeuDeCartes = value;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String value){
        this.nom = value;
    }
}


