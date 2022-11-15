package org.Game.Board;

public class Legetoejsbutik extends Fields {


    public Legetoejsbutik(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 16;

        return fieldID;
    }
}
