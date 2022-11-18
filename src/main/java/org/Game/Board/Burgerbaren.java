package org.Game.Board;

public class Burgerbaren extends PropertyFields {

    private static Burgerbaren burgerbaren;

    private Burgerbaren() {
        super(1,1);
    }

    public int buyableFieldID() {
        int fieldID = 1;

        return fieldID;
    }

    public static Burgerbaren getInstance(){
        if(burgerbaren == null){
            burgerbaren = new Burgerbaren();
        }

        return burgerbaren;
    }
}
