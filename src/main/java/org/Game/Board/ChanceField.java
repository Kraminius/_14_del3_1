package org.Game.Board;

import org.Game.ChanceCards.Deck;
import org.Game.GameLogic;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

public class ChanceField extends Fields {



    private int index;
    private Deck deck = new Deck();

    private DirectGUICommands directGUICommands = DirectGUICommands.getInstance();

    public ChanceField() {

    }

    public int buyableFieldID() {
        int fieldID = 0;

        return fieldID;
    }

    @Override
    public void turnAction(Player player) {

        int currentCardId = deck.getCards().get(index).getId();


        System.out.println(currentCardId);
        //Shows message on center card
        directGUICommands.chanceCardGUI(deck.getCards().get(index).getDescription());

        switch (currentCardId){
            case 0:
                //Pick property
                String property = dropDownMenu("Skaterparken","Pizzariaet");
                Fields fields = whatIsPick(property);
                //freePropertyOrRent(player, );
                break;
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
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
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
        }

        this.index += 1;

        if(index == 16){
            this.index = 0;
        }


    }


    public void freePropertyOrRent(Player player, PropertyFields propertyFields){
        if(propertyFields == null){
            propertyFields.setPlayer(player);
            directGUICommands.ownedPropertyGUI(player, Skateparken.getInstance().fieldID);
            directGUICommands.changeBalanceGUI(player);
        }
        else {
            Skateparken.getInstance().payRent(player);
        }

    }

    public String dropDownMenu(String property1, String property2){
        return directGUICommands.pickProperty(property1,property2);
    }

    public PropertyFields whatIsPick(String property){

        switch (property){
            case "Skaterparken":
                return Skateparken.getInstance();
            case "Pizzariaet":
                return Pizzariaet.getInstance();
        }


        return null;
    }

}
