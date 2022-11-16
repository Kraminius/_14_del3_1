package org.Game.Board;

import gui_fields.GUI_Car;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;
import org.Game.Player.Player;

public class Picker {
    private Fields fields;


    public void landedField(Player player, int fieldIndex) {
        switch (fieldIndex) {
            case 1:
                fields = Burgerbaren.getInstance();
                fields.buyable(player);
                break;
            case 2:
                fields = Pizzariaet.getInstance();
                fields.buyable(player);
                break;
            case 4:
                fields = Slikbutikken.getInstance();
                fields.buyable(player);
                break;
            case 5:
                fields = Iskiosken.getInstance();
                fields.buyable(player);
                break;
            case 7:
                fields = Museet.getInstance();
                fields.buyable(player);
                break;
            case 8:
                fields = Biblioteket.getInstance();
                fields.buyable(player);
                break;
            case 10:
                fields = Skateparken.getInstance();
                fields.buyable(player);
                break;
            case 11:
                fields = Swimmingpool.getInstance();
                fields.buyable(player);
                break;
            case 13:
                fields = Spillehallen.getInstance();
                fields.buyable(player);
                break;
            case 14:
                fields = Kinoen.getInstance();
                fields.buyable(player);
                break;
            case 16:
                fields = Legetoejsbutik.getInstance();
                fields.buyable(player);
                break;
            case 17:
                fields = Dyrehandlen.getInstance();
                fields.buyable(player);
                break;
            case 19:
                fields = Bowlinghallen.getInstance();
                fields.buyable(player);
                break;
            case 20:
                fields = ZoologiskHave.getInstance();
                fields.buyable(player);
                break;
            case 22:
                fields = Vandlandet.getInstance();
                fields.buyable(player);
                break;
            case 23:
                fields = Strandpromenaden.getInstance();
                fields.buyable(player);
                break;

            default:
//testcommit

        }
    }
}

