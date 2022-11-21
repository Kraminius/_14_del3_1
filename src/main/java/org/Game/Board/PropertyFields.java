package org.Game.Board;

import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public abstract class PropertyFields extends Fields {
    int fieldID;
    private int fieldRent;

    DirectGUICommands directGUICommands = DirectGUICommands.getInstance();

    Player player;
    Instantiering instantiering = new Instantiering();

    public PropertyFields(int Id, int fieldRent){
        this.fieldID = Id;
        this.fieldRent = fieldRent;
    }

    public abstract int buyableFieldID();

    public void buyableOrRent(Player player) {
        if (this.player == null) {
            isPlayerLoadedOrNot(player);
        }
        else {
            payRent(player);
        }

    }
    public void buyProperty(Player player) {
        this.player = player;
        player.setMoney(player.getMoney()-this.fieldRent);
        directGUICommands.ownedPropertyGUI(player, fieldID);
        directGUICommands.changeBalanceGUI(player);

    }

    public void isPlayerLoadedOrNot(Player player) {
        if (player.getMoney() >= fieldRent) {
            buyProperty(player);
        }

    }

    public void payRent(Player player){

        player.setMoney(player.getMoney()-this.fieldRent);
        this.player.setMoney(this.player.getMoney()+this.fieldRent);
        directGUICommands.reentGUI(this.player,player);

    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void turnAction(Player player) {
        buyableOrRent(player);

    }


}
