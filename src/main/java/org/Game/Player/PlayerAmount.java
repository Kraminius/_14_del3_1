package org.Game.Player;
//We found a more simple way of handling amount of players from code-review. We're looking at the lenght of the player array instead.
public class PlayerAmount {
    static int amountOfPlayers;
    public PlayerAmount(int amount){
        amountOfPlayers = amount;
    }

    public static int getPlayerAmount() {
        return amountOfPlayers;
    }

    public void setPlayerAmount(int amount) {
        amountOfPlayers = amount;
    }
}
