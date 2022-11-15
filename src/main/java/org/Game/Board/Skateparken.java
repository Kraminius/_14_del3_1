package org.Game.Board;

import gui_fields.GUI_Ownable;
import gui_main.GUI;
import gui_fields.GUI_Ownable;

import java.awt.*;

public class Skateparken extends Fields {
GUI gui = new GUI();

    public int buyableFieldID() {
        int fieldID = 8;

        return fieldID;
    }
    public void guiOwned() {
        ((GUI_Ownable)gui.getFields()[8]).setBorder(Color.GREEN);
    }
}
