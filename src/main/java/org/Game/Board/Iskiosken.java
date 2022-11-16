package org.Game.Board;

import org.hamcrest.core.Is;

public class Iskiosken extends Fields {

    private static Iskiosken iskiosken;
    private Iskiosken() {
        super(5, 1);
    }

    public int buyableFieldID() {
        int fieldID = 5;

        return fieldID;
    }

    public static Iskiosken getInstance(){
        if(iskiosken == null){
            iskiosken = new Iskiosken();
        }
        return iskiosken;
    }

}
