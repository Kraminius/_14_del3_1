package org.Game.ChanceCards;

import org.Game.Player.Player;

public class Functionality {
    Descriptions desc = new Descriptions();
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
                break;
            case 10:
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
