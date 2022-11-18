package org.Game.Board;

public class Skateparken extends PropertyFields {

    private static Skateparken skateparken;

    private Skateparken() {
        super(10, 2);
    }


    public int buyableFieldID() {
        int fieldID = 10;

        return fieldID;
    }

    public static Skateparken getInstance(){
        if(skateparken == null){
            skateparken = new Skateparken();
        }
        return skateparken;
    }
}
