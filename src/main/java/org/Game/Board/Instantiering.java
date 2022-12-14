package org.Game.Board;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Instantiering {
    // Laver Monoply JR boarded
    public GUI_Field[] fields = {
            new GUI_Start("Start", "Modtag M$2, når du passerer", "Modtag M$2, når du passerer", Color.WHITE, Color.BLACK),
            new GUI_Street("Burgerbaren", "M$1", "", "1", new Color(163, 108, 29), Color.BLACK),
            new GUI_Street("Pizzariaet", "M$1", "", "1", new Color(163, 108, 29), Color.BLACK),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street("Slikbutikken", "M$1", "", "1", new Color(38, 166, 191), Color.BLACK),
            new GUI_Street("Iskiosken", "M$1", "", "1", new Color(38, 166, 191), Color.BLACK),
            new GUI_Jail("default", "", "Bare på besøg", "Bare på besøg", Color.WHITE, Color.BLACK),
            new GUI_Street("Museet", "M$2", "", "2", new Color(186, 45, 132), Color.BLACK),
            new GUI_Street("Biblioteket", "M$2", "", "2", new Color(186, 45, 132), Color.BLACK),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street("Skateparken", "M$2", "", "2", new Color(201, 204, 45), Color.BLACK),
            new GUI_Street("Swimmingpoolen", "M$2", "", "2", new Color(201, 204, 45), Color.BLACK),
            new GUI_Refuge("default", "", "Gratis Parkering", "Gratis Parkering, tag en slapper", Color.WHITE, Color.BLACK),
            new GUI_Street("Spillehallen", "M$3", "", "3", new Color(176, 26, 51), Color.BLACK),
            new GUI_Street("Kinoen", "M$3", "", "3", new Color(176, 26, 51), Color.BLACK),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street("Legetøjsbutikken", "M$3", "", "3", new Color(235, 252, 40), Color.BLACK),
            new GUI_Street("Dyrehandlen", "M$3", "", "3", new Color(235, 252, 40), Color.BLACK),
            new GUI_Jail("default", "", "Gå i fængsel", "Gå i fængsel", Color.WHITE, Color.BLACK),
            new GUI_Street("Bowlinghallen", "M$4", "", "4", new Color(31, 173, 53), Color.BLACK),
            new GUI_Street("Zoologisk Have", "M$4", "", "4", new Color(31, 173, 53), Color.BLACK),
            new GUI_Chance("?", "Chancen", "Træk et chancekort", Color.WHITE, Color.BLACK),
            new GUI_Street("Vandlandet", "M$5", "", "5", new Color(50, 75, 166), Color.BLACK),
            new GUI_Street("Strandpromenaden", "M$5", "", "5", new Color(50, 75, 166), Color.BLACK),
    };

}
