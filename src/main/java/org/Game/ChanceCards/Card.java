package org.Game.ChanceCards;

import java.io.Serializable;

public class Card {
    private int id;
    private String description;
    private String function;

    public Card (int ID, String desc){
        this.description = desc;
        this.id = ID;

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
