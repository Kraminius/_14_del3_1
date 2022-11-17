package org.example;

import org.Game.Board.Fields;
import org.Game.Board.Picker;
import org.Game.ChanceCards.Functionality;
import org.Game.GameLogic;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DirectGUICommands guiCommands = DirectGUICommands.getInstance();
        GameLogic gameLogic = new GameLogic();
        Player player = new Player();
        player.AmountOfPlayers(guiCommands.PlayerAmount());
        guiCommands.AddPlayers(player);

        while(true){

            Player turnPlayer = player.NextPlayer();

            guiCommands.StartTurn(turnPlayer);
            gameLogic.MovePlayer(turnPlayer);
            gameLogic.buyProperty(turnPlayer,turnPlayer.getPosition());
        }





    }
    public static void CardsTest(Player player){
        Functionality f = new Functionality();
        f.doFunction(9, player);
    }
    /*public static void buyPropertyTest(Player player, int fieldIndex){
        Picker picker = new Picker();
        picker.landedField(player,fieldIndex);
    }*/

}