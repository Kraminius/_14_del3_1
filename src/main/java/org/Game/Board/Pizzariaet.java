package org.Game.Board;

public class Pizzariaet extends Fields {

    public Pizzariaet(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 2;

        return fieldID;
    }
}
