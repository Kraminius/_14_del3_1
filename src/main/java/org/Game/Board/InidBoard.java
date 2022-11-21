package org.Game.Board;

import org.hamcrest.core.Is;

public class InidBoard {

    private Fields[] board;

    public InidBoard(){

        board = new Fields[24];

        ChanceField chanceField = new ChanceField();
        Prison prison = new Prison();
        Dummy dummy = new Dummy();

        board[0] = dummy;
        board[1] = Burgerbaren.getInstance();
        board[2] = Pizzariaet.getInstance();
        board[3] = chanceField;
        board[4] = Slikbutikken.getInstance();
        board[5] = Iskiosken.getInstance();
        board[6] = dummy;
        board[7] = Museet.getInstance();
        board[8] = Biblioteket.getInstance();
        board[9] = chanceField;
        board[10] = Skateparken.getInstance();
        board[11] = Swimmingpool.getInstance();
        board[12] = dummy;
        board[13] = Spillehallen.getInstance();
        board[14] = Kinoen.getInstance();
        board[15] = chanceField;
        board[16] = Legetoejsbutik.getInstance();
        board[17] = Dyrehandlen.getInstance();
        board[18] = prison;
        board[19] = Bowlinghallen.getInstance();
        board[20] = ZoologiskHave.getInstance();
        board[21] = chanceField;
        board[22] = Vandlandet.getInstance();
        board[23] = Strandpromenaden.getInstance();


    }


    public Fields[] getBoard() {
        return board;
    }

    public void setBoard(Fields[] board) {
        this.board = board;
    }
}
