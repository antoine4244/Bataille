package com.testEnum;

public class Main {
    public static void main(String [] args) {
        Formateur unFormateur = new Formateur();
        unFormateur.enseigner();
        JavaFormateur javaFormateur = new JavaFormateur();
        javaFormateur.nom = "Jonathan";
        javaFormateur.enseigner();
        javaFormateur.enseignerJava();
        AndroidFormateur androidFormateur = new AndroidFormateur();
        androidFormateur.nom = "Rodolphe";
        androidFormateur.enseigner();
        androidFormateur.enseignerAndroid();
        System.out.println(unFormateur instanceof Formateur);
        System.out.println(javaFormateur instanceof Formateur);
        System.out.println(javaFormateur instanceof JavaFormateur);
        System.out.println(unFormateur instanceof JavaFormateur);

    }
}
