package org.Game.Player;

public class MovePlayers {
    int[] playerPositions;

    public MovePlayers(Player[] players){
        for(int i = 0; i < players.length; i++){
            players[i].getPosition();
        }
    }
}
