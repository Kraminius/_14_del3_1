package org.Game.ChanceCards;

public class Cards {
    private Card[] cards = new Card[20];

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
                c.CreateCard(description, func);
                cards[i] = c;
                break;
            }
        }
    }
}
