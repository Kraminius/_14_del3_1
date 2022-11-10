package org.Game.ChanceCards;

import org.Game.Player.Player;

import java.util.Random;

public class Cards {
    private Card[] cards = new Card[20];
    private boolean hasShuffled = false;

    public void createCards(){
        Descriptions desc = new Descriptions();
        String [] descriptions = desc.getCardInfo();
        String [] functions = desc.getCardInfo();
        for(int i = 0; i < cards.length; i++){
            if(cards[i] == null)
            {
                String description = descriptions[i];
                String func = functions[i];
                Card c = new Card();
                c.CreateCard(i, description, func);
                cards[i] = c;
                break;
            }
        }
    }
    public Card pullCard(){
        Random rnd = new Random();
        if(!hasShuffled){
            for(int i = 0; i< cards.length; i++){
                Card temp = cards[i];
                int other = rnd.nextInt(0, cards.length);
                cards[i] = cards[other];
                cards[other] = temp;
            }
            hasShuffled = true;
        }
        return cards[0];
    }
    public void chanceCard(Player player){
        Card newCard = pullCard();
        Functionality func = new Functionality();
        if(func.doFunction(newCard.getId(), player)){ //Does the cards actions, returns true if card is put back. returns false if player keeps it.
            for(int i = 0; i< cards.length-1; i++){
                cards[i] = cards[i+1];
            }
            cards[cards.length-1] = newCard;
        }
    }
}
