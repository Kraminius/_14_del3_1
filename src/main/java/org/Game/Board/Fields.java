package org.Game.Board;

import org.Game.Player.Player;

public abstract class Fields {

    private int fieldID;
    public Fields() {

    }

    public abstract void turnAction(Player player);


}
