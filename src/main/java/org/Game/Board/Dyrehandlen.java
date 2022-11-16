package org.Game.Board;

public class Dyrehandlen extends Fields {

    private static Dyrehandlen dyrehandlen;
    private Dyrehandlen() {
        super(17, 3);
    }

    public int buyableFieldID() {
        int fieldID = 17;

        return fieldID;
    }

    public static Dyrehandlen getInstance(){
        if(dyrehandlen == null){
            dyrehandlen = new Dyrehandlen();
        }
        return dyrehandlen;
    }

}
