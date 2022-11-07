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
    private GUI_Player andreas;


    public DirectGUICommands(){

        gui = getInstanceGUI();


    }

    public void CreateGUI(){


    }

    public void MovePlayer(Player player){

        RollDice rollDice = new RollDice();

        rollDice.Roll();
        int ourRoll = rollDice.getOurRolls();

        int nextFieldPlacement = player.getPosition() + ourRoll;

        if (nextFieldPlacement > 39){
            nextFieldPlacement = nextFieldPlacement - 40;
        }

        GUI_Field fields = gui.getFields()[nextFieldPlacement];

        andreas.getCar().setPosition(fields);

        player.setPosition(nextFieldPlacement);
        System.out.println(ourRoll);


    }

    public void AddPlayers(Player Cplayer){
        GUI_Car car = new GUI_Car();
        car.setPrimaryColor(Color.GREEN);
        GUI_Player player = new GUI_Player("Andreas",20000,car);
        gui.addPlayer(player);

        GUI_Field fields = gui.getFields()[0];
        player.getCar().setPosition(fields);

        Cplayer.setPosition(0);

        this.andreas = player;

    }

    public static GUI getInstanceGUI(){
        if(gui == null){
            gui = new GUI();
        }
        return gui;
    }



}
