package org.guiContact;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import org.Game.Die.RollDice;
import org.Game.Player.Player;

import java.awt.*;

public class DirectGUICommands {
    private static GUI gui;
    private GUI_Player[] gui_players;

    private Color[] colors = new Color[4];


    public DirectGUICommands(){

        gui = getInstanceGUI();
        colors[0] = Color.BLACK;
        colors[1] = Color.BLUE;
        colors[2] = Color.GREEN;
        colors[3] = Color.MAGENTA;


    }

    public void CreateGUI(){


    }

    //This method moves a player
    public void MovePlayer(Player player){

        RollDice rollDice = new RollDice();

        //Rolls
        rollDice.Roll();
        int ourRoll = rollDice.getOurRolls();

        //Finds players next position
        int nextFieldPlacement = player.getPosition() + ourRoll;

        //Method for going back to first field
        if (nextFieldPlacement > 39){
            nextFieldPlacement = nextFieldPlacement - 40;
        }

        //Which field player has landed on
        GUI_Field fields = gui.getFields()[nextFieldPlacement];
        //Sets GUIPlayer position (player id-1 because of array, maybe change playerid's to start at 0)
        gui_players[player.getID()-1].getCar().setPosition(fields);
        //Sets player object position
        player.setPosition(nextFieldPlacement);

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
            GUI_Player guiplayer = new GUI_Player("Player" + (i+1),20000,car);
            gui.addPlayer(guiplayer);

            GUI_Field fields = gui.getFields()[0];
            guiplayer.getCar().setPosition(fields);

            this.gui_players[i] = guiplayer;
        }

    }

    public static GUI getInstanceGUI(){
        if(gui == null){
            gui = new GUI();
        }
        return gui;
    }
    public String GetStringFromPlayer(String msg){
        return gui.getUserString(msg);
    }
    public int GetIntFromPlayer(String msg){
        return gui.getUserInteger(msg);
    }
    public String TwoChoiceMessage(String msg, String option1, String option2){
        String chosenButton = gui.getUserButtonPressed(msg,option1, option2);
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



}
