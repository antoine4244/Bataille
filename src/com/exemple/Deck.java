package com.exemple;

import java.util.ArrayList;

public class Deck {
    /** attributs **/
    private ArrayList<Card> cards;

    /** constructeurs **/
    public Deck() {
        this.cards = new ArrayList<>();
    }
    public Deck(Deck deckToAdd){
        this();
        if(deckToAdd != null){
            this.cards.addAll(deckToAdd.cards);
        }
    }

    /** méthodes **/
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public Card pullTopCard() {
        return cards.get(0);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(int index) {
        cards.remove(index);
    }
}