package org.Game.Board;

public class Pizzariaet extends PropertyFields {

    private static Pizzariaet pizzariaet;

    private Pizzariaet() {
        super(2, 1);
    }

    public int buyableFieldID() {
        int fieldID = 2;

        return fieldID;
    }

    public static Pizzariaet getInstance(){
        if(pizzariaet == null){
            pizzariaet = new Pizzariaet();
        }

        return pizzariaet;
    }


}
