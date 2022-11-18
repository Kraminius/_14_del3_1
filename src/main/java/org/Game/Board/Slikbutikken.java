package org.Game.Board;

public class Slikbutikken extends PropertyFields {

    private static Slikbutikken slikbutikken;
    private Slikbutikken() {
        super(4, 1);
    }

    public int buyableFieldID() {
        int fieldID = 4;

        return fieldID;
    }

    public static Slikbutikken getInstance(){
        if(slikbutikken == null){
            slikbutikken = new Slikbutikken();
        }
        return slikbutikken;
    }

}
