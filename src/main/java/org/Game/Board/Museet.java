package org.Game.Board;

public class Museet extends Fields {


    public Museet(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 7;

        return fieldID;
    }
}
