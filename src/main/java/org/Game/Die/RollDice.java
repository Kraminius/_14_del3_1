package org.Game.Die;

import java.util.Random;
//The base-code is copied from earlier project made by same group. Modified slightly to work in this project.
public class RollDice {

    private int []ourRolls; //The collected rolls

    private final int numberOfRolls = 2; //Number of times the die is being rolled
    private Die die = new Die();
    public void Roll(){
        ourRolls = new int[numberOfRolls];
        Random random = new Random();

        for (int i = 0;i<numberOfRolls;i++){ //Runs loop a number of times equal to number of rolls.
            ourRolls[i] = random.nextInt((die.getMaximum()- die.getMinimum())+1)+1; //Rolls the die, and get a random number between min and max

        }
    }

    public int[] getOurRolls() {
        return ourRolls;
    }

    public void setOurRolls(int[] ourRolls) {
        this.ourRolls = ourRolls;
    }

}
