package org.Game.Board;

public class Bowlinghallen extends Fields {

    private static Bowlinghallen bowlinghallen;
    private Bowlinghallen() {
        super(19, 4);
    }

    public int buyableFieldID() {
        int fieldID = 19;

        return fieldID;
    }

    public static Bowlinghallen getInstance(){
        if(bowlinghallen == null){
            bowlinghallen = new Bowlinghallen();
        }
        return bowlinghallen;
    }

}
