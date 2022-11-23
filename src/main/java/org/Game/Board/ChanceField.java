package org.Game.Board;

import org.Game.ChanceCards.Deck;
import org.Game.GameLogic;
import org.Game.Player.Player;
import org.guiContact.DirectGUICommands;

import java.text.NumberFormat;

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
                String[] properties = {"Skaterparken"};

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
                didPlayerPassStart(player, 0);
                movePlayer(player, 0);
                break;
            case 9:
                chanceCardTooMuchCandy(player);
                break;
            case 10:
                break;
            case 11:
                PropertyFields propertyFields = Strandpromenaden.getInstance();
                didPlayerPassStart(player, 23);
                movePlayer(player, 23);
                propertyFields.buyableOrRent(player);
                break;
            case 12:
                chanceCardBirthday(player);
                break;
            case 13:
                chanceCardGoodBoyHomeWork(player);
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
            propertyFields.payRent(player);
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

    /**
     * Chancecard: 11 You ate too much candy. Retracts -2 money from current balance of current player.
     * @param player
     */
    public void chanceCardTooMuchCandy(Player player){
        player.setMoney(player.getMoney()-2);
        directGUICommands.changeBalanceGUI(player);
    }

    public void chanceCardMoveToStrandpromenaden(Player player){

        player.setPosition(23);
        directGUICommands.MovePlayer(player, 23);
    }

    /**
     * Chancecard 14: It's your birthday, receive 1 money from each of the other players.
     * This one sets current players money to player.getmoney() (current amount)+ the lenght of the player.getPlayers() array
     * that gives 1 money too much, and we correct for that in the for loop, where it retracts 1 money from EACH player (also yourself).
     * You'll receive money before the money is retracted, so you can't go bankrupt from landing on this field.
     * @param player
     */
    public void chanceCardBirthday(Player player){

        player.setMoney(player.getMoney()+player.getPlayers().length);
        for (int i=0; i<player.getPlayers().length;i++) {
            player.getPlayers()[i].setMoney(player.getPlayers()[i].getMoney()-1);
            directGUICommands.changeBalanceGUI(player.getPlayers()[i]);
        }

    }

    /**
     * Chancecard 15. You did all your homework. Receive +2 money from the bank. Bank has no account, so we just add +2 to money attribute on the player object.
     * @param player
     */
    public void chanceCardGoodBoyHomeWork(Player player) {
        player.setMoney(player.getMoney()+2);
        directGUICommands.changeBalanceGUI(player);
    }

    /**
     * If players current position is higher than the index they will move to, they will move over start, and gets +2 money.
     * @param player
     * @param index
     */
    public void didPlayerPassStart(Player player, int index){
        if (player.getPosition()>index){
            player.setMoney(player.getMoney()+2);
        }
    }

}


