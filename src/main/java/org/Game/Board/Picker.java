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

            default:
//testcommit

        }
    }
}

