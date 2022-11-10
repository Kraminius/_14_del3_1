package org.Game.Board;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Instantiering {
    // Laver Monoply JR boarded
    public GUI_Field[] fields = {
            new GUI_Start("Start", "Modtag M$2, når du passerer", "Modtag M$2, når du passerer", Color.WHITE, Color.BLACK),
            new GUI_Street("Burgerbaren", "M$1", "", "1", new Color(102, 51, 0), Color.WHITE),
            new GUI_Street("Pizzariaet", "M$1", "", "1", new Color(102, 51, 0), Color.WHITE),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street("Slikbutikken", "M$1", "", "1", new Color(38, 166, 191), Color.BLACK),
            new GUI_Street("Iskiosken", "M$1", "", "1", new Color(38, 166, 191), Color.BLACK),
            new GUI_Jail("default", "", "Bare på besøg", "Bare på besøg", Color.WHITE, Color.BLACK),
            new GUI_Street("Museet", "M$2", "", "2", new Color(186, 45, 132), Color.BLACK),
            new GUI_Street("Biblioteket", "M$2", "", "2", new Color(186, 45, 132), Color.BLACK),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Refuge(),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Jail("default", "", "Gå i fængsel", "Gå i fængsel", Color.WHITE, Color.BLACK),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street(),
            new GUI_Street(),
    };

}
