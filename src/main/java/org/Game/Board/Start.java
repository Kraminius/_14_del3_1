package org.Game.Board;

public class Start extends PropertyFields {
    public Start(int Id, int fieldRent) {
        super(Id, fieldRent);
    }

    @Override
    public int buyableFieldID() {
        return 0;
    }
}
