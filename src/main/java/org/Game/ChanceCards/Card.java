package org.Game.ChanceCards;

import java.io.Serializable;

public class Card {
    private String name;
    private String description;
    private String function;

    public Card(String name, String desc, String func) {

    }

    public Card CreateCard(String cardName, String desc, String cardFunction){
        setName(cardName);
        setDescription(desc);
        setFunction(cardFunction);
        return this;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
