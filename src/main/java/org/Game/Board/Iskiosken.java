package org.Game.Board;

public class Iskiosken extends Fields {


    public Iskiosken(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 5;

        return fieldID;
    }
}
