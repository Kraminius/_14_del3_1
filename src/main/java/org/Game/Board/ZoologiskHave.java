package org.Game.Board;

public class ZoologiskHave extends Fields {

    private static ZoologiskHave zoologiskHave;
    private ZoologiskHave() {
        super(20, 4);
    }

    public int buyableFieldID() {
        int fieldID = 20;

        return fieldID;
    }

    public static ZoologiskHave getInstance(){
        if(zoologiskHave == null){
            zoologiskHave = new ZoologiskHave();
        }
        return zoologiskHave;
    }

}
