package org.Game.Die;

import java.util.Random;
//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class RollDice {

    private int ourRoll; //The collected rolls

    private final int numberOfRolls = 1; //Number of times the die is being rolled
    private Die die = new Die();
    public void Roll(){
        Random random = new Random();


            ourRoll = random.nextInt((die.getMaximum()- die.getMinimum())+1)+1; //Rolls the die, and get a random number between min and max


    }

    public int getOurRolls() {
        return ourRoll;
    }

    public void setOurRolls(int ourRoll) {
        this.ourRoll = ourRoll;
    }

}
