package org.guiContact;

import gui_main.GUI;

public class DirectGUICommands {
    private static GUI gui;

    public DirectGUICommands(){

        gui = getInstance();

    }

    public void CreateGUI(){


    }


    public void AddPlayers(){



    }

    public static GUI getInstance(){
        if(gui == null){
            gui = new GUI();
        }
        return gui;
    }


}
