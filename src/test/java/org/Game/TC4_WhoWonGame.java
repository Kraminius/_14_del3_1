package org.Game;

import org.Game.Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TC4_WhoWonGame {

    public Player whoWon(Player player){
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
        return temp;
    }

    @Test
    void whoWonGame() {

        Player player = new Player();
        player.AmountOfPlayers(4);
        player.getPlayers()[0].setMoney(23);
        player.getPlayers()[1].setMoney(24);
        player.getPlayers()[2].setMoney(26);
        player.getPlayers()[3].setMoney(4);

        int expected = player.getPlayers()[2].getID();
        assertEquals(expected, whoWon(player).getID(), "We expect the sorting algorithm to make it so player 3 wins.");

    }
}