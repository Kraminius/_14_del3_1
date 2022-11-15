package org.Game.Board;

public class Swimmingpool extends Fields {


    public Swimmingpool(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 11;

        return fieldID;
    }
}
