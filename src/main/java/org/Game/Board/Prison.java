package org.Game.Board;

import org.Game.Player.Player;
import org.guiContact.ControllerGUI;

public class Prison extends Fields{

    ControllerGUI controllerGUI = ControllerGUI.getInstance();


    @Override
    public void turnAction(Player player) {
        //Skal stå hvad der sker når man ryger i fængsel


        player.setPosition(6); //Prison Location
        controllerGUI.MovePlayer(player, 6);
        player.setJail(true);







    }
}
