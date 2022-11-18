package org.Game.ChanceCards;

import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public class Functionality {
    Descriptions desc = new Descriptions();
    DirectGUICommands gui = DirectGUICommands.getInstance();

   /* public boolean doFunction(int id, Player player){
        boolean returnCard = true;
        int position = player.getPosition();
       String[] descriptions = desc.getCardInfo();
        switch (id){
            case 0:
                //Show the description descriptions[0];
                //Find navnene på begge felter
                String navn1 = "";
                String navn2 = "";
                switch (gui.TwoChoiceMessage([0], navn1, navn2)){
                    case "1":
                        //Ryk spilleren til navn1
                        //Enten betal leje eller få felt uden at betale.
                        break;
                    case "2":
                        //Ryk spilleren til navn2
                        //Enten betal leje eller få felt uden at betale.
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case 1:
                //Show the description descriptions[1]; Gratis Orange eller grønt
                break;
            case 2:
                //Show the description descriptions[2]; Gratis Lyseblåt
                break;
            case 3:
                //Show the description descriptions[3]; Gratis Pink eller mørkeblåt
                break;
            case 4:
                //Show the description [4] Gratis Rød
                break;
            case 5:
                //Ryk til skaterparken, det er gratis
                break;
            case 6: //lyseblåt eller rødt gratis

                break;
            case 7: //Gratis brunt eller gult

                break;
            case 8: //Ryk til start

                break;
            case 9:
                int move = gui.GetIntFromPlayer(descriptions[9] + " Indtast antallet herunder:");
                if(move >= 0 && move <= 6) {
                    //Move player (move) amount of steps. = position + move
                }
                else{
                    while(move < 1 || move > 5){
                        move = gui.GetIntFromPlayer(descriptions[9] + " Dit indtastede tal var udenfor mængden 1-5, prøv igen:");
                    }
                    //Move player (move) amount of steps. = position + move
                }
                break;
            case 10:
                switch (gui.TwoChoiceMessage(descriptions[10], "Ryk 1 felt frem","Tag et Chancekort mere")){
                    case "1":
                        //Ryk spilleren et felt frem. = position +1
                        break;
                    case "2":
                        //Pull new card (Needs to be called from the same Class that calls the Cards, otherwise it won't be the same deck and problems will arise.
                        break;
                    default:
                        System.out.println("error");
                        break;
                }

                break;
            case 11: //Betal 2 penge

                break;
            case 12:
                //Get out of jail card
                returnCard = false;
                break;
            case 13: //Ryk til strandpromenaden, ikke gratis

                break;
            case 14: //Fødelsdag, modtag 1 fra hver
                Player[] players = player.getPlayers();
                for(int i = 0; i<players.length; i++){

                }


                break;
            case 15: //Modate 2 af banken.
                gui.messageBox(descriptions[15]);
                player.setMoney(player.getMoney() + 2);
                break;
            default:
                System.out.println("Pulled card index is outside of the array of descriptions and functionality");
                break;



        }
        return returnCard;

        */
    }