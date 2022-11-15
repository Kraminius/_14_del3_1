package org.Game.Board;

public class Slikbutikken extends Fields {

    public Slikbutikken(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 4;

        return fieldID;
    }
}
