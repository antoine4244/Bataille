package com.example;

public class Main {
    public static void main(String[] args) {
        Joueur leJoueur1 = new Joueur();
        leJoueur1.setNom("Jean");
        leJoueur1.initJeuCartes();
        System.out.println(leJoueur1.getNom() + " tire la carte " +
                leJoueur1.tirerUneCarte() + ".");
    }
}
