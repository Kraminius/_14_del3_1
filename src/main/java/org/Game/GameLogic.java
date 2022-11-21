package org.Game;

import org.Game.Board.Picker;
import org.Game.Die.RollDice;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public class GameLogic {

    DirectGUICommands directGUICommands = DirectGUICommands.getInstance();

    private boolean endGame = false;

    public void MovePlayer(Player player){
        /*
        if(player.getPosition() == Prison && player.getJail()){
            if(player.getGOOJCard()) player.setGOOJCard(false);
            else player.setMoney(player.getMoney() - 1);

            player.setJail(false);
        }


        */
        RollDice rollDice = new RollDice();

        //Rolls
        rollDice.Roll();
        int ourRoll = rollDice.getOurRolls();

        //Finds players next position
        int nextFieldPlacement = player.getPosition() + ourRoll;

        //Method for going back to first field and giving +2 money for crossing start-line
        if (nextFieldPlacement > 23){
            nextFieldPlacement = nextFieldPlacement - 24;
            player.setMoney(player.getMoney()+2);
        }


        player.setPosition(nextFieldPlacement);
/*      if(nextFieldPlacement == GoToPrison){
            nextFieldPlacement = Prison;
            player.setJail(true);
        */


        directGUICommands.MovePlayer(player, nextFieldPlacement, ourRoll);

    }

    public static void buyProperty(Player player, int fieldIndex){
        Picker picker = new Picker();
        picker.landedField(player,fieldIndex);
    }

    public void printPlayerPositionToConsole(int fieldIndex) {
        fieldIndex = 0;

        System.out.println(fieldIndex);
    }

    public void endGameCondition(Player player){
        for(int i = 0; i < player.getPlayers().length; i++){
            if(player.getPlayers()[i].getMoney() < 0){
                endGame = true;
            }
        }

    }

    public void startMoney(Player player) {

        if (player.getPlayers().length == 4) {
            for (int i = 0; i < 4; i++) {
                player.getPlayers()[i].setMoney(16);
            }
        }
        if (player.getPlayers().length == 3) {
            for (int j = 0; j < 3; j++) {
                player.getPlayers()[j].setMoney(18);
            }
        }
        if (player.getPlayers().length == 2) {
            for (int k = 0; k < 2; k++) {
                player.getPlayers()[k].setMoney(20);
            }
        }
    }


    public void whoWon(Player player){
        Player temp;
        for(int i = 0; i < player.getPlayers().length; i++){
            for(int j = i+1; j < player.getPlayers().length; j++){
                if(player.getPlayers()[i].getMoney()>player.getPlayers()[j].getMoney()){
                    temp = player.getPlayers()[i];
                    player.getPlayers()[i] = player.getPlayers()[j];

                    player.getPlayers()[j] = temp;
                }
            }

        }

        temp = player.getPlayers()[player.getPlayers().length-1];

        directGUICommands.winningGUI(temp);

    }

    public boolean isEndGame() {
        return endGame;
    }

    public void playerIsInPrison(){

    }

}
