package com.testEnum;

public class Main {
    public static void main(String [] args) {
        Voiture a = new Voiture(); //sans paramètre
        Voiture b = new Voiture ("Tesla"); //surchargé
        Voiture c = new Voiture (b); //recopie
        a.display();
        b.display();
        c.display();
        

    }
}
