package org.Game.Board;

public class Vandlandet extends PropertyFields {

    private static Vandlandet vandlandet;
    private Vandlandet() {
        super(22, 5);
    }

    public int buyableFieldID() {
        int fieldID = 22;

        return fieldID;
    }

    public static Vandlandet getInstance(){
        if(vandlandet == null){
            vandlandet = new Vandlandet();
        }
        return vandlandet;
    }

}
