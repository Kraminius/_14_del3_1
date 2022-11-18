package org.Game.Board;

public class Swimmingpool extends PropertyFields {

    private static Swimmingpool swimmingpool;
    private Swimmingpool() {
        super(11, 2);
    }

    public int buyableFieldID() {
        int fieldID = 11;

        return fieldID;
    }

    public static Swimmingpool getInstance(){
        if(swimmingpool == null){
            swimmingpool = new Swimmingpool();
        }
        return swimmingpool;
    }

}
