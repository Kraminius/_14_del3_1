package org.Game;

import org.Game.Board.Fields;
import org.Game.Board.InidBoard;
import org.Game.ChanceCards.Deck;
import org.Game.Die.RollDice;
import org.Game.Player.Player;
import org.Game.Board.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC5_DelayTest {

    InidBoard board = new InidBoard();
    Player player = new Player();

    //Runde som vi kan køre et antal gange
    public void TurnProcessDelay(){

        player.AmountOfPlayers(4);

            //Creates empty player object
            Player turnPlayer;

                //Finds current player
                turnPlayer = player.NextPlayer();
                turnPlayer.setPlayers(player.getPlayers());
                System.out.println("Spilleren er " + turnPlayer.getColor());

        //Moves player and roll dice
        MovePlayer(turnPlayer);
        //Field response
        processTurn(turnPlayer);

        }

        //Flytte spiller
        public void MovePlayer(Player player){
            RollDice rollDice = new RollDice();

            //Rolls
            rollDice.Roll();
            int ourRoll = rollDice.getOurRolls();

            //Finds players next position
            int nextFieldPlacement = player.getPosition() + ourRoll;
            //Undgår chancekort og fængsel
            if(nextFieldPlacement == 3 || nextFieldPlacement == 9 || nextFieldPlacement == 15 || nextFieldPlacement == 21 || nextFieldPlacement == 18){
                nextFieldPlacement = 10;
            }

            //Method for going back to first field and giving +2 money for crossing start-line
            if (nextFieldPlacement > 23){
                nextFieldPlacement = nextFieldPlacement - 24;
                //Undgår igen chancekort
                if(nextFieldPlacement == 3){
                    nextFieldPlacement = 10;
                }
                player.setMoney(player.getMoney()+2);
            }


            player.setPosition(nextFieldPlacement);
        }

        //Turn udfører en handling
    public void processTurn(Player player){
        Fields fields = board.getBoard()[player.getPosition()];
        fields.turnAction(player);
    }





        @Test
        @DisplayName("delay tælles op")
        void testGameDelay() {
            double delay1, delay2, delayTotal = 0, delayGathered = 0;
            int timesRun = 1000;
            boolean works = false;

            for(int i = 0; i < timesRun; i++){
                delay1 = System.currentTimeMillis();
                TurnProcessDelay();
                delay2 = System.currentTimeMillis();
                delayTotal += delay2-delay1;
                delayGathered = delayGathered + delayTotal;
                System.out.println("kørsel #" + (i+1) + " Havde Delay på " + delayTotal + " milli sekunder");
            }
            System.out.println("Samlet delay er " + delayGathered + "milli sekunder");
            final double maxDelay = 1000 * timesRun;
            if(delayGathered < maxDelay)
                works = true;

            assertEquals(true, works,
                    "checks that delays are short");
        }

    }