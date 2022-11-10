package org.Game.ChanceCards;

import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public class Functionality {
    Descriptions desc = new Descriptions();
    DirectGUICommands gui = new DirectGUICommands();
    public boolean doFunction(int id, Player player){
        boolean returnCard = true;
        String[] descriptions = desc.getCardInfo();
        switch (id){
            case 0:
                //Show the description descriptions[0];
                break;
            case 1:
                //Show the description descriptions[1];
                break;
            case 2:
                //Show the description descriptions[2];
                break;
            case 3:
                //Show the description descriptions[3];
                break;
            case 4:
                //Show the description [4]
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:
                int move = gui.GetIntFromPlayer(descriptions[9] + " Indtast antallet herunder:");
                if(move >= 0 && move <= 6) {
                    //Move player (move) amount of steps.
                }
                else{
                    while(move < 1 || move > 5){
                        move = gui.GetIntFromPlayer(descriptions[9] + " Dit indtastede tal var udenfor mængden 1-5, prøv igen:");
                    }
                    //Move player (move) amount of steps.
                }
                break;
            case 10:
                switch (gui.TwoChoiceMessage(descriptions[10], "Ryk 1 felt frem","Tag et Chancekort mere")){
                    case "1":
                        //Ryk spilleren et felt frem.
                        break;
                    case "2":
                        //Pull new card (Needs to be called from the same Class that calls the Cards, otherwise it won't be the same deck and problems will arise.
                        break;
                    default:
                        System.out.println("error");
                        break;
                }

                break;
            case 11:
                break;
            case 12:
                //Get out of jail card
                returnCard = false;
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            default:
                System.out.println("Pulled card index is outside of the array of descriptions and functionality");
                break;

        }
        return returnCard;
    }




}
