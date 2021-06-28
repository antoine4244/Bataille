
import java.util.Scanner;

/*
Ex 1 : calcul du carré


public class monPremierProjet {
    public static void main(String[] args) {
        int resultat = calculDeCarre();
        System.out.println("Le carré est de : " + resultat);
    }

    public static int lectureDansLaConsole(String phrase){
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int calculDeCarre(){
        String maPhrase = "Veuillez saisir un nombre : ";
        int nombre2 = lectureDansLaConsole(maPhrase);
        return nombre2*nombre2;
    }

};

Ex 2 : calcul de la somme

public class monPremierProjet {
    public static void main(String[] args) {
        int resultat = calculDeLaSomme();
        System.out.println("La somme est de : " + resultat);
    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int calculDeLaSomme() {
        String maPhrase = "Veuillez saisir un nombre : ";
        int nombre2 = lectureDansLaConsole(maPhrase);
        String maPhrase2 = "Veuillez saisir un autre nombre : ";
        int nombre3 = lectureDansLaConsole(maPhrase2);
        return nombre2 + nombre3;
    }
};

Ex 3 : Calcul de la moyenne

public class monPremierProjet {
    public static void main(String[] args) {
        int resultat = calculDeLaMoyenne();
        System.out.println("La moyenne est de : " + resultat);
    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int calculDeLaMoyenne() {
        String maPhrase = "Veuillez saisir un nombre : ";
        int nombre2 = lectureDansLaConsole(maPhrase);
        String maPhrase2 = "Veuillez saisir un autre nombre : ";
        int nombre3 = lectureDansLaConsole(maPhrase2);
        String maPhrase3 = "Veuillez saisir encore un autre nombre : ";
        int nombre4 = lectureDansLaConsole(maPhrase3);
        return (nombre2 + nombre3 + nombre4)/3;
    }
};

Ex 4 : Calcul de la moyenne

public class monPremierProjet {
    public static void main(String[] args) {
        float resultat = calculDePrix();
        System.out.println("Le prix TTC est de : " + resultat);
    }

    public static float lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        float nombre = scanner.nextFloat();
        scanner.nextLine();
        return nombre;
    }

    public static float calculDePrix() {
        String maPhrase = "Veuillez saisir le prix HT d'un produit : ";
        float nombre2 = lectureDansLaConsole(maPhrase);
        String maPhrase2 = "Veuillez saisir le nombre d'articles : ";
        float nombre3 = lectureDansLaConsole(maPhrase2);
        String maPhrase3 = "Veuillez saisir le taux de TVA (en %) : ";
        float nombre4 = lectureDansLaConsole(maPhrase3);
        return (nombre2 + (nombre4*nombre2)/100) * nombre3;
    }
};

LES BOUCLES

Ex 1 : produit de deux nombres positif ou négatif

public class monPremierProjet {
    public static void main(String[] args) {
         produitDeDeuxNombres();

    }

    public static double lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        double nombre = scanner.nextDouble();
        scanner.nextLine();
        return nombre;
    }

    public static void produitDeDeuxNombres() {
        String maPhrase1 = "Veuillez saisir un nombre : ";
        double nombre1 = lectureDansLaConsole(maPhrase1);
        String maPhrase2 = "Veuillez saisir un deuxième nombre : ";
        double nombre2 = lectureDansLaConsole(maPhrase2);


        if (nombre1<0 && nombre2<0){
            System.out.println("Le produit des deux nombres est positif");
        }else if (nombre1>0 && nombre2<0){
            System.out.println("Le produit des deux nombres est négatif");
        }else{
            System.out.println("Le produit des deux nombres est positif");
        }

    }
}

Ex 2 :

public class monPremierProjet {
    public static void main(String[] args) {
         produitDeDeuxNombres();

    }

    public static double lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        double nombre = scanner.nextDouble();
        scanner.nextLine();
        return nombre;
    }

    public static void produitDeDeuxNombres() {
        String maPhrase1 = "Veuillez saisir un nombre : ";
        double nombre1 = lectureDansLaConsole(maPhrase1);
        String maPhrase2 = "Veuillez saisir un deuxième nombre : ";
        double nombre2 = lectureDansLaConsole(maPhrase2);


        if (nombre1<0 && nombre2<0){
            System.out.println("Le produit des deux nombres est positif !");
        }else if (nombre1>0 && nombre2<0){
            System.out.println("Le produit des deux nombres est négatif !");
        }else if (nombre1>0 && nombre2>0){
            System.out.println("Le produit des deux nombres est positif !");
        }else{
            System.out.println("Le produit est nul !");
        }

    }
};

Ex 3 : catégorie de joueurs

public class monPremierProjet {
    public static void main(String[] args) {
        categorieEnfant();

    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    public static void categorieEnfant() {
        String maPhrase1 = "Veuillez saisir l'âge de l'enfant : ";
        String start = "Votre enfant sera dans la catégorie : ";
        int age = lectureDansLaConsole(maPhrase1);
        if (age >= 6 && age <= 7) {
            System.out.println(start + "poussin");
        } else if (age >= 8 && age <= 9) {
            System.out.println(start + "pupille");
        } else if (age >= 10 && age <= 11) {
            System.out.println(start + "minime");
        } else if (age >= 12 && age < 18) {
            System.out.println(start + "cadet");
        } else if (age < 6){
            System.out.println(start+ "trop jeune");
        } else{
            System.out.println(start+ "trop vieux");
        }
    }
};

Ex 4 : horloge décalée d'une minute




public class monPremierProjet {
    public static void main(String[] args) {
        laMinuteApres();

    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int decalage = scanner.nextInt();
        scanner.nextLine();
        return decalage;



    }

    public static string laMinuteApres() {
        String maPhrase1 = "Veuillez saisir l'heure : ";
        int heure = lectureDansLaConsole(maPhrase1);
        String maPhrase2 = "Veuillez saisir les minutes : ";
        int minutes = lectureDansLaConsole(maPhrase2);
        int decalage = 
        if (minutes<60){
            String decalage = "Dans une minute, il sera " + heure + "heure(s)" + minutes++;
        }

        return decalage;



    }
};

Les boucles FOR


Ex 1 :

public class monPremierProjet {
    public static void main(String[] args) {
        reponseQuiConvienne();

    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int reponseQuiConvienne() {
        int nombre = lectureDansLaConsole("Donner un nombre :");

        for (int i = 0;  i < 4; i++);
            if (nombre >= 1 && nombre <4){
                System.out.println("Vous avez le bon nombre");
            }else{
                System.out.println("essayez encore !");
            }
            return nombre;
    }
};

ex 2 :


public class monPremierProjet {
    public static void main(String[] args) {
        reponseQuiConvienne();
    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int reponseQuiConvienne() {
        int nombre = lectureDansLaConsole("Donnez un nombre compris entre 10 et 20 :");

        for (int i = 10; i < 20; i++) ;
        if (nombre >= 10 && nombre < 20) {
            System.out.println("Vous avez le bon nombre !!");
        } else if (nombre < 10) {
            System.out.println("Plus grand !");
        } else {
            System.out.println("Plus petit !");
        }
        return nombre;
    }
};

ex 3 : 10 de plus !


public class monPremierProjet {
    public static void main(String[] args) {
        dixDePlus();
    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int dixDePlus() {
        int nombre = lectureDansLaConsole("Donnez un nombre :");
        int i=1;
        while(i<11)
        {
            System.out.println(nombre + i);
            i++;
        }
        return nombre;
    }
};

ex 4 : les tables de multiplication



public class monPremierProjet {
    public static void main(String[] args) {
        tableDeMultiplication();
    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int tableDeMultiplication() {
        int nombre = lectureDansLaConsole("Donnez un nombre :");
        int i=1;
        while(i<11)
        {
            System.out.println(nombre + " x " + i + " = " + (nombre*i));
            i++;
        }
        return nombre;
    }
};

ex 5 : calcul de la factorielle

*/

public class monPremierProjet {
    public static void main(String[] args) {
        calculFactorielle();
    }

    public static int lectureDansLaConsole(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int calculFactorielle() {
        int nombre = lectureDansLaConsole("Donnez un nombre :");
        int i=1;
        int factorielle = 0;

        while(i<=nombre){
        factorielle += i;
        i++;}

        System.out.println(factorielle);

        return nombre;
    }
};



