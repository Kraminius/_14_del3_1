package org.Game.ChanceCards;

public class Cards {
    private Card[] cards = new Card[24];

    public Card createCard(String name, String desc, String func){
        Card c = new Card(name, desc, func);
        for(int i = 0; i < cards.length; i++){
            if(cards[i] == null)
            {
                cards[i] = c; break;
            }
        }
    }
}
