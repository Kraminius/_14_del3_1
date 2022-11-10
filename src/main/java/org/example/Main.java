package org.example;

import org.Game.ChanceCards.Functionality;
import org.Game.GameLogic;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DirectGUICommands guiCommands = DirectGUICommands.getInstance();
        GameLogic gameLogic = new GameLogic();
        Player player = new Player();
        player.AmountOfPlayers(4);
        guiCommands.AddPlayers(player);

        while(true){
            //Write something in console to roll

            guiCommands.StartTurn();
            gameLogic.MovePlayer(player.NextPlayer());
        }





    }
    public static void CardsTest(Player player){
        Functionality f = new Functionality();
        f.doFunction(9, player);
    }

}

//TestAndreas