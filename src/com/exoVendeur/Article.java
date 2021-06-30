package com.exoVendeur;

import java.text.DecimalFormat;

public class Article {
    private String nomArticle;
    private DecimalFormat prix;


    public Article(String nomArticle, DecimalFormat prix) {
        this.nomArticle = nomArticle;
        this.prix = prix;
    }

    public DecimalFormat getPrix() {
        return prix;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public void setPrix(DecimalFormat prix) {
        this.prix = prix;
    }

    public String getNomArticle() {
        return nomArticle;
    }
}
