package org.Game.ChanceCards;

import java.io.Serializable;

public class Card {
    private String description;
    private String function;

    public Card CreateCard(String desc, String cardFunction){
        setDescription(desc);
        setFunction(cardFunction);
        return this;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
