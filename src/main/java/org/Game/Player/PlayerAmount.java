package org.Game.Player;

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
