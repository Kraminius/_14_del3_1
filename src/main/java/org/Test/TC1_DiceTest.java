package org.Test;

import org.Game.Die.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TC1_DiceTest {

    @Test
    @DisplayName("Dice is random (within 5% of average)")
    void testAddMoney() {
        int rollNumber = 1000; //Hvor mange gange terningen rulles
        int value = 0;
        float expected, expectedMin, expectedMax;
        for(int i=0; i<= rollNumber; i++) {
            //Terning 1
            RollDice rollDice1 = new RollDice();
            rollDice1.Roll();
            //Lægge terningerne sammen oven i tidligere rul
            value += rollDice1.getOurRolls();
        }
        expected = (float) (rollNumber*3.5);
        expectedMin = (float) (expected-(expected*0.05));
        expectedMax =(float) (expected+(expected*0.05));
        System.out.println("Samlet sum af terningen" + value);
        assertTrue((expectedMax > value) && (expectedMin < value), "expected (" + expected + ") should be near collected sum" + value);

        /*assertEquals(expected, value,
                "checks that dice is fair"); */
    }

}