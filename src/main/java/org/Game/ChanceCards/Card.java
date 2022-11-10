package org.Game.ChanceCards;

import java.io.Serializable;

public class Card {
    private int id;
    private String description;
    private String function;

    public Card CreateCard(int ID, String desc, String cardFunction){
        setDescription(desc);
        setFunction(cardFunction);
        setId(ID);
        return this;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
