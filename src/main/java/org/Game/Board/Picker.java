package org.Game.Board;

import org.Game.Player.Player;

public class Picker {
    private Fields fields;


    public void landedField(Player player, int fieldIndex) {
        switch (fieldIndex) {
            case 1:
                fields = Burgerbaren.getInstance();
                fields.turnAction(player);
                break;
            case 2:
                fields = Pizzariaet.getInstance();
                fields.turnAction(player);
                break;
            case 4:
                fields = Slikbutikken.getInstance();
                fields.turnAction(player);
                break;
            case 5:
                fields = Iskiosken.getInstance();
                fields.turnAction(player);
                break;
            case 7:
                fields = Museet.getInstance();
                fields.turnAction(player);
                break;
            case 8:
                fields = Biblioteket.getInstance();
                fields.turnAction(player);
                break;
            case 10:
                fields = Skateparken.getInstance();
                fields.turnAction(player);
                break;
            case 11:
                fields = Swimmingpool.getInstance();
                fields.turnAction(player);
                break;
            case 13:
                fields = Spillehallen.getInstance();
                fields.turnAction(player);
                break;
            case 14:
                fields = Kinoen.getInstance();
                fields.turnAction(player);
                break;
            case 16:
                fields = Legetoejsbutik.getInstance();
                fields.turnAction(player);
                break;
            case 17:
                fields = Dyrehandlen.getInstance();
                fields.turnAction(player);
                break;
            case 19:
                fields = Bowlinghallen.getInstance();
                fields.turnAction(player);
                break;
            case 20:
                fields = ZoologiskHave.getInstance();
                fields.turnAction(player);
                break;
            case 22:
                fields = Vandlandet.getInstance();
                fields.turnAction(player);
                break;
            case 23:
                fields = Strandpromenaden.getInstance();
                fields.turnAction(player);
                break;

            default:
//testcommit

        }
    }
}

