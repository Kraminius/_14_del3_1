package org.Game.Board;

public class Kinoen extends Fields {

    private static Kinoen kinoen;
    private Kinoen() {
        super(14, 3);
    }

    public int buyableFieldID() {
        int fieldID = 14;

        return fieldID;
    }

    public static Kinoen getInstance(){
        if(kinoen == null){
            kinoen = new Kinoen();
        }
        return kinoen;
    }

}
