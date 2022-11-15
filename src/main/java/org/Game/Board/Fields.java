package org.Game.Board;

import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_main.GUI;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public abstract class Fields {
    int fieldID;
    private int fieldRent;


    Player player;
    Instantiering instantiering = new Instantiering();

    public Fields(int Id, int fieldRent){
        this.fieldID = Id;
        this.fieldRent = fieldRent;
    }

    public abstract int buyableFieldID();

    public void buyable(Player player) {
        if (this.player == null) {
            isPlayerLoadedOrNot(player);
        }

    }
    public void buyProperty(Player player) {
        this.player = player;
        DirectGUICommands directGUICommands = DirectGUICommands.getInstance();
        directGUICommands.ownedPropertyGUI(player, fieldID);
    }

    public void isPlayerLoadedOrNot(Player player) {
        if (player.getMoney() >= fieldRent) {
            buyProperty(player);
        }

    }
}
