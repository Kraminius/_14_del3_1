package org.example;

import org.Game.GameLogic;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameLogic gameLogic = new GameLogic();


        /*DirectGUICommands guiCommands = DirectGUICommands.getInstance();
        GameLogic gameLogic = new GameLogic();
        Player player = new Player();
        player.AmountOfPlayers(guiCommands.PlayerAmount());
        gameLogic.startMoney(player);
        guiCommands.AddPlayers(player);
        Player turnPlayer;


        do{

            turnPlayer = player.NextPlayer();
            guiCommands.StartTurn(turnPlayer);
            gameLogic.MovePlayer(turnPlayer);
            gameLogic.buyProperty(turnPlayer,turnPlayer.getPosition());
            gameLogic.endGameCondition(player);
        }while (!gameLogic.isEndGame());

        gameLogic.whoWon(player);


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

*/

    }
    /*public static void CardsTest(Player player){
        Functionality f = new Functionality();
        f.doFunction(9, player);
    }

     */


    /*public static void buyPropertyTest(Player player, int fieldIndex){
        Picker picker = new Picker();
        picker.landedField(player,fieldIndex);
    }*/

}