package org.Game;

import org.Game.Board.Picker;
import org.Game.Die.RollDice;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public class GameLogic {



    public void MovePlayer(Player player){

        RollDice rollDice = new RollDice();

        //Rolls
        rollDice.Roll();
        int ourRoll = rollDice.getOurRolls();

        //Finds players next position
        int nextFieldPlacement = player.getPosition() + ourRoll;

        //Method for going back to first field
        if (nextFieldPlacement > 23){
            nextFieldPlacement = nextFieldPlacement - 24;
        }

        player.setPosition(nextFieldPlacement);

        DirectGUICommands directGUICommands = DirectGUICommands.getInstance();
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

}
