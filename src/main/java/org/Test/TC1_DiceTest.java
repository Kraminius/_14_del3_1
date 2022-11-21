package org.Test;

import org.Game.Die.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC1_DiceTest {

    @Test
    @DisplayName("Dice is random (within 5% of expected)")
    void testDice() {
        int rollNumber = 10000; //Hvor mange gange terningen rulles
        int value = 0;
        //Mulige terninge øjne
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        float expecVal, expecValMin, expecValMax;
        float expected, expectedMin, expectedMax;
        for(int i=0; i<= rollNumber; i++) {
            //Terning 1
            RollDice rollDice1 = new RollDice();
            rollDice1.Roll();
            //Lægge terningerne sammen oven i tidligere rul
            value += rollDice1.getOurRolls();
            //Gem hvilken værdi blev slået
            switch(rollDice1.getOurRolls()){
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                default:
                    System.out.println("Fejl i terning");
                    break;
            }
        }
        //Middelværdi
        expected = (float) (rollNumber*3.5);
        expectedMin = (float) (expected-(expected*0.05));
        expectedMax =(float) (expected+(expected*0.05));

        //Forskellige værdier
        expecVal = (float) (rollNumber/6);
        expecValMin = (float) (expecVal-(expecVal*0.05));
        expecValMax =(float) (expecVal+(expecVal*0.05));

        //Se om middel er fin
        assertTrue((expectedMax > value) && (expectedMin < value), "expected (" + expected + ") should be near collected sum" + value);
        System.out.println("Samlet sum af terningen " + value + "forventede værdi er " + expected);

        //Se om enkelte øjne er fin
        assertTrue((expecValMax > one) && (expecValMin < one), "expected for 1 (" + expecVal + ") should be near collected sum of 1 " + one);
        System.out.println("Samlet sum af 1 " + one + "forventede værdi er " + expecVal);
        assertTrue((expecValMax > two) && (expecValMin < two), "expected for 2 (" + expecVal + ") should be near collected sum of 2 " + two);
        System.out.println("Samlet sum af 2 " + two + "forventede værdi er " + expecVal);
        assertTrue((expecValMax > three) && (expecValMin < three), "expected for 3 (" + expecVal + ") should be near collected sum of 3 " + three);
        System.out.println("Samlet sum af 3 " + three + "forventede værdi er " + expecVal);
        assertTrue((expecValMax > four) && (expecValMin < four), "expected for 4 (" + expecVal + ") should be near collected sum of 4 " + four);
        System.out.println("Samlet sum af 4 " + four + "forventede værdi er " + expecVal);
        assertTrue((expecValMax > five) && (expecValMin < five), "expected for 5 (" + expecVal + ") should be near collected sum of 5 " + five);
        System.out.println("Samlet sum af 5 " + five + "forventede værdi er " + expecVal);
        assertTrue((expecValMax > six) && (expecValMin < six), "expected for 6 (" + expecVal + ") should be near collected sum of 6 " + six);
        System.out.println("Samlet sum af 6 " + six + "forventede værdi er " + expecVal);

    }

}