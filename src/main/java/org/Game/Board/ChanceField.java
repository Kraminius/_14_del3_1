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

        //Declare String array for properties


        switch (currentCardId){
            case 0: {

                //Possible roperties
                String[] properties = {"Skaterparken", "Swimmingpool"};

                fullTurn(player, properties);

                break;
            }
            case 1: {
                //Possible roperties
                String[] properties = {"Skaterparken", "Swimmingpool", "Bowlinghallen", "Zoologiskhave"};

                fullTurn(player, properties);
                break;
            }
            case 2: {
                //Possible roperties
                String[] properties = {"Iskiosken","Slikbutikken"};

                fullTurn(player, properties);
                break;
            }
            case 3: {
                String[] properties = {"Museet","Biblioteket","Vandlandet","Strandpromenaden"};

                fullTurn(player, properties);
                break;
            }
            case 4: {
                String[] properties = {"Spillehallen","Kinoen"};

                fullTurn(player, properties);
                break;
            }
            case 5: {
                String[] properties = {"Skateparken"};

                fullTurn(player, properties);
                break;
            }
            case 6: {
                String[] properties = {"Spillehallen","Kinoen","Iskiosken","Slikbutikken"};

                fullTurn(player, properties);
                break;
            }
            case 7: {
                String[] properties = {"Legetoejsbutik", "Dyrehandlen","Pizzariaet","Burgerbaren"};

                fullTurn(player, properties);
                break;
            }
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
        if(propertyFields.player == null){
            propertyFields.setPlayer(player);
            directGUICommands.ownedPropertyGUI(player, propertyFields.fieldID);
            directGUICommands.changeBalanceGUI(player);
        }
        else {
            Skateparken.getInstance().payRent(player);
        }
        //Moves player
        movePlayer(player, propertyFields.getFieldID());

    }

    public String dropDownMenuProperty(String[] property1){
        return directGUICommands.pickProperty(property1);
    }



    public PropertyFields whatIsPick(String property){

        switch (property){
            case "Skaterparken":
                return Skateparken.getInstance();
            case "Swimmingpool":
                return Swimmingpool.getInstance();
            case "Bowlinghallen":
                return Bowlinghallen.getInstance();
            case "Zoologiskhave":
                return ZoologiskHave.getInstance();
            case "Iskiosken":
                return Iskiosken.getInstance();
            case "Slikbutikken":
                return Slikbutikken.getInstance();
            case "Museet":
                return Museet.getInstance();
            case "Biblioteket":
                return Biblioteket.getInstance();
            case "Vandlandet":
                return Vandlandet.getInstance();
            case "Strandpromenaden":
                return Strandpromenaden.getInstance();
            case "Spillehallen":
                return Spillehallen.getInstance();
            case "Kinoen":
                return Kinoen.getInstance();
            case "Legetoejsbutik":
                return Legetoejsbutik.getInstance();
            case "Dyrehandlen":
                return Dyrehandlen.getInstance();
            case "Pizzariaet":
                return Pizzariaet.getInstance();
            case "Burgerbaren":
                return Burgerbaren.getInstance();
        }


        return null;
    }

    public void movePlayer(Player player, int index){
        player.setPosition(index);
        directGUICommands.MovePlayer(player, index);
    }

    public void fullTurn(Player player, String[] properties){
        //Pick property
        String property = dropDownMenuProperty(properties);
        //Finds corresponding classobject
        PropertyFields fields = whatIsPick(property);
        //Decides if free or rent
        freePropertyOrRent(player, fields);
    }

}
