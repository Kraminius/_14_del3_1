package org.Game.Board;

public class Museet extends Fields {

    private static Museet museet;
    private Museet() {
        super(7, 2);
    }

    public int buyableFieldID() {
        int fieldID = 7;

        return fieldID;
    }

    public static Museet getInstance(){
        if(museet == null){
            museet = new Museet();
        }
        return museet;
    }

}
