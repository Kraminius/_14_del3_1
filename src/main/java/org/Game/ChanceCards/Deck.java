package org.Game.ChanceCards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cards;
    Descriptions desc = new Descriptions();

    public Deck(){

        Card[] cards = new Card[14];

        String[] liste = desc.fileReader(1);

        for (int i = 0; i < cards.length; i++){
            cards[i] = new Card(i, liste[i]);
        }

        List<Card> cards1 = Arrays.asList(cards);

        Collections.shuffle(cards1);

        this.cards = cards1;


    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
