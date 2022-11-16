package org.Game.Board;

public class Legetoejsbutik extends Fields {

    private static Legetoejsbutik legetoejsbutik;
    private Legetoejsbutik() {
        super(16, 3);
    }

    public int buyableFieldID() {
        int fieldID = 16;

        return fieldID;
    }

    public static Legetoejsbutik getInstance(){
        if(legetoejsbutik == null){
            legetoejsbutik = new Legetoejsbutik();
        }
        return legetoejsbutik;
    }

}
