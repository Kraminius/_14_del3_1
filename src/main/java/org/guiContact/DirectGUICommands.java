package org.guiContact;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import org.Game.Board.Instantiering;
import org.Game.Die.*;
import org.Game.Player.Player;

import java.awt.*;

public class DirectGUICommands {

    private static DirectGUICommands directGUICommands;
    private static GUI gui;
    private GUI_Player[] gui_players;

    private Color[] colors = new Color[4];


    private DirectGUICommands(){

        gui = getInstanceGUI();
        colors[0] = Color.BLACK;
        colors[1] = Color.BLUE;
        colors[2] = Color.GREEN;
        colors[3] = Color.MAGENTA;


    }

    public void CreateGUI(){


    }

    //This method moves a player
    public void MovePlayer(Player player, int nextFieldPlacement, int ourRoll){


        //Which field player has landed on
        GUI_Field fields = gui.getFields()[nextFieldPlacement];
        //Sets GUIPlayer position (player id-1 because of array, maybe change playerid's to start at 0)
        gui_players[player.getID()-1].getCar().setPosition(fields);


        gui.setDie(ourRoll);

        //Prints roll and player id to console in console
        System.out.println("Roll: " +ourRoll);
        System.out.println("PlayerID: " +player.getID());


    }

    public void AddPlayers(Player ClassPlayer){

        //Creates gui_players array which is equal to how many players we have
        gui_players = new GUI_Player[ClassPlayer.getPlayers().length];

        //for each player we create a new GUI_Player object
        for(int i =0; i < ClassPlayer.getPlayers().length; i++){
            GUI_Car car = new GUI_Car();
            car.setPrimaryColor(colors[i]);
            GUI_Player guiplayer = new GUI_Player("Player" + (i+1),18,car);
            gui.addPlayer(guiplayer);

            GUI_Field fields = gui.getFields()[0];
            guiplayer.getCar().setPosition(fields);

            this.gui_players[i] = guiplayer;
        }

    }

    public static GUI getInstanceGUI(){
        Instantiering instantiering = new Instantiering();

        if(gui == null){
            gui = new GUI(instantiering.fields);
        }
        return gui;
    }
    public String GetStringFromPlayer(String msg){
        gui.displayChanceCard(msg);
        return gui.getUserString("");
    }
    public int GetIntFromPlayer(String msg){
        gui.displayChanceCard(msg);
        return gui.getUserInteger("");
    }
    public String TwoChoiceMessage(String msg, String option1, String option2){
        gui.displayChanceCard(msg);
        String chosenButton = gui.getUserButtonPressed("",option1, option2);
        if(chosenButton == option1){
            return "1";
        }
        else if(chosenButton == option2){
            return "2";
        }
        else{
            System.out.println("Failure to understand returned answer");
            return "false";
        }
    }
    public void messageBox(String msg){
        gui.displayChanceCard(msg);
        gui.showMessage("");
    }

    public static DirectGUICommands getInstance(){
        if(directGUICommands == null){
            directGUICommands = new DirectGUICommands();
        }

        return directGUICommands;
    }

}
