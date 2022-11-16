package org.Game.Board;

import gui_fields.GUI_Field;
import org.guiContact.DirectGUICommands;

public class Burgerbaren extends Fields {

    private static Burgerbaren burgerbaren;

    private Burgerbaren() {
        super(1,1);
    }

    public int buyableFieldID() {
        int fieldID = 1;

        return fieldID;
    }

    public static Burgerbaren getInstance(){
        if(burgerbaren == null){
            burgerbaren = new Burgerbaren();
        }

        return burgerbaren;
    }
}
