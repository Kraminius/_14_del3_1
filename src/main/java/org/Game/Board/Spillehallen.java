package org.Game.Board;

public class Spillehallen extends Fields {

    private static Spillehallen spillehallen;
    private Spillehallen() {
        super(13, 3);
    }

    public int buyableFieldID() {
        int fieldID = 13;

        return fieldID;
    }

    public static Spillehallen getInstance(){
        if(spillehallen == null){
            spillehallen = new Spillehallen();
        }
        return spillehallen;
    }

}
