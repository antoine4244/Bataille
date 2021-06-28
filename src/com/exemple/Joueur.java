package com.exemple;

public class Player {
    /** attributs **/
    private String name;
    private Deck deck;

    /** méthodes **/
    public Card pullCard() {
        return deck.pullTopCard();
    }

    public void initCards(int nbCardsInDeck) {
    }

    /** getters and setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}