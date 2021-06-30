package com.exemple;

public class Card {
    /** attribut **/
    private final CardValue lValue;
    private final CardSign lSign;

    /** Énumérations **/
    public enum CardValue {
        DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS
    }

    public enum CardSign {
        PIQUES, TREFLES, CARREAUX, COEURS
    }

    /** constructeurs **/
    public Card(CardValue pValue, CardSign pSign){
        lValue = pValue;
        lSign = pSign;
    }

    /** méthodes **/

    public CardValue getValue() {
        return lValue;
    }

    public CardSign getlSign() {
        return lSign;
    }
}
