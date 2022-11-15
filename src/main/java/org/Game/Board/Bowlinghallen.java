package org.Game.Board;

public class Bowlinghallen extends Fields {


    public Bowlinghallen(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 19;

        return fieldID;
    }
}
