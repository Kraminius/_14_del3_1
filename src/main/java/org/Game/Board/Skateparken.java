package org.Game.Board;

import gui_fields.GUI_Ownable;
import gui_main.GUI;
import gui_fields.GUI_Ownable;

import java.awt.*;

public class Skateparken extends Fields {

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
