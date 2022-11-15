package org.Game.Board;

public class Biblioteket extends Fields {

    public Biblioteket(int fieldID, int fieldRent) {
        super(fieldID, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 8;

        return fieldID;
    }

}
