package org.Game.Board;

public class Kinoen extends Fields {


    public Kinoen(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    public int buyableFieldID() {
        int fieldID = 14;

        return fieldID;
    }
}
