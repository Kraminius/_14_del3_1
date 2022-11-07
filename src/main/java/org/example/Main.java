package org.example;

import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DirectGUICommands guiCommands = new DirectGUICommands();
        Player player = new Player();
        guiCommands.AddPlayers(player);

        while(true){
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            guiCommands.MovePlayer(player);
        }



        

    }
}

//TestAndreas