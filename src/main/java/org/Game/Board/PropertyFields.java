package org.Game.Board;

import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public abstract class PropertyFields extends Fields {
    int fieldID;
    private int fieldRent;


    Player player;
    Instantiering instantiering = new Instantiering();

    public PropertyFields(int Id, int fieldRent){
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

    @Override
    public void turnAction(Player player) {
        buyProperty(player);
    }


}
