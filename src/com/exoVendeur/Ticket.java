package com.exoVendeur;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ticket {
    private Date dateArticle;
    private Vendeur vendeur;
    private ArrayList<Article> articles = new ArrayList<>();


    public Ticket(Date dateArticle, Vendeur vendeur, ArrayList<Article> articles) {
        this.dateArticle = dateArticle;
        this.vendeur = vendeur;
        this.articles = articles;
    }

    public Date getDateArticle() {
        return dateArticle;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }


    public void setDateArticle(Date dateArticle) {
        this.dateArticle = dateArticle;
    }

    public void setArticles(Article article){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien d'articles avez-vous scannés ?");
        int nbrArticle = scanner.nextInt();

        for (int i=0; i<nbrArticle; i++){
            this.articles.add(article);
        }
    }
}
