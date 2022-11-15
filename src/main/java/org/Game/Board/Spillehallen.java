package org.Game.Board;

public class Spillehallen extends Fields {

    public Spillehallen(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 13;

        return fieldID;
    }
}
