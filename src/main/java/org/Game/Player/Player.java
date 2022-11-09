package org.Game.Player;

public class Player {

    //Variable for determining next player
    private int nID = -1;
    private int position; //A spot between 1 and 40
    private int ID;


    private Player[] players;



    public Player(){

        this.position = 0;

    }

    //Creates player array and gives each player an ID (Hard coded to 4 players)
    public void AmountOfPlayers(int howManyPlayers){
        players = new Player[howManyPlayers];
        for(int i=0; i<players.length;i++ ){
            players[i] = new Player();
            players[i].setID(i+1);
        }

    }

    //Finds next player and returns player object
    public Player NextPlayer(){
        nID++;

        if(nID>3){
            nID =0;
        }

        return players[nID];


    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
