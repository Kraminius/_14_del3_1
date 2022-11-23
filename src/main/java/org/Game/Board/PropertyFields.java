package org.Game.Board;

import org.Game.Player.Player;
import org.guiContact.ControllerGUI;

public abstract class PropertyFields extends Fields {
    int fieldID;
    private int fieldRent;

    ControllerGUI controllerGUI = ControllerGUI.getInstance();

    Player player;


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
        controllerGUI.ownedPropertyGUI(player, fieldID);
        controllerGUI.changeBalanceGUI(player);

    }

    public void isPlayerLoadedOrNot(Player player) {
        if (player.getMoney() >= fieldRent) {
            buyProperty(player);
        }

    }

    public void payRent(Player player){

        player.setMoney(player.getMoney()-this.fieldRent);
        this.player.setMoney(this.player.getMoney()+this.fieldRent);
        controllerGUI.reentGUI(this.player,player);

    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void turnAction(Player player) {
        buyableOrRent(player);

    }

    public int getFieldID() {
        return fieldID;
    }
}
