package org.Game.Board;

public class Biblioteket extends Fields {

    private static Biblioteket biblioteket;
    private Biblioteket() {
        super(8, 2);
    }

    public int buyableFieldID() {
        int fieldID = 8;

        return fieldID;
    }

    public static Biblioteket getInstance(){
        if(biblioteket == null){
            biblioteket = new Biblioteket();
        }
        return biblioteket;
    }

}
