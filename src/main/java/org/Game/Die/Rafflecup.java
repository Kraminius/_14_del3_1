package org.Game.Die;

import java.util.Random;
//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class Rafflecup {

    private final int MAXIMUM = 6;
    private final int MINIMUM = 1;

    private int ourRoll; //The collected rolls

    private final int numberOfRolls = 1; //Number of times the die is being rolled
    public void Roll(){
        Random random = new Random();

            ourRoll = random.nextInt((MAXIMUM-MINIMUM)+1)+1; //Rolls the die, and get a random number between min and max

    }

    public int getOurRolls() {
        return ourRoll;
    }

    public void setOurRolls(int ourRoll) {
        this.ourRoll = ourRoll;
    }

}
