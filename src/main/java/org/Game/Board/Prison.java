package org.Game.Board;

import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public class Prison extends Fields{

    DirectGUICommands directguicommands = DirectGUICommands.getInstance();


    @Override
    public void turnAction(Player player) {
        //Skal stå hvad der sker når man ryger i fængsel


        player.setPosition(6); //Prison Location
        directguicommands.MovePlayer(player, 6);
        player.setJail(true);







    }
}
