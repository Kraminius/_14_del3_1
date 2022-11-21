package org.Game;

import org.Game.Player.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TC3_MoneyTest {

    @Test
    @DisplayName("Earning money")
    void testAddMoney() {

        Player player = new Player();
        int expected;
        int startMoney = 5, earnedMoney = 7;
        player.setMoney(startMoney);
        player.setMoney(player.getMoney() + earnedMoney);

        //Forventet penge
        expected = startMoney + earnedMoney;

        assertEquals(expected, player.getMoney(),
                "checks that money can be earned");
        System.out.println("Penge efter test: " + player.getMoney() + " Forventet penge: " + expected);
    }

    @Test
    @DisplayName("Loosing money")
    void testLooseMoney() {

        Player player = new Player();
        int expected;
        int startMoney = 7, lostMoney = 5;
        player.setMoney(startMoney);
        player.setMoney(player.getMoney() - lostMoney);

        //Forventet penge
        expected = startMoney - lostMoney;

        assertEquals(expected, player.getMoney(),
                "checks that money can be lost");
        System.out.println("Penge efter test: " + player.getMoney() + " Forventet penge: " + expected);
    }

    @Test
    @DisplayName("No money")
    void testZeroMoney() {

        Player player = new Player();
        int lostMoney, expected;
        int startMoney = 7;
        lostMoney = startMoney;
        player.setMoney(startMoney);
        player.setMoney(player.getMoney() - lostMoney);

        //Forventet penge
        expected = 0;

        assertEquals(expected, player.getMoney(),
                "checks that money can reach zero");
        System.out.println("Penge efter test: " + player.getMoney() + " Forventet penge: " + expected);
    }

    @Test
    @DisplayName("Negative money")
    void testNegativeMoney() {

        Player player = new Player();
        int lostMoney, expected;
        int startMoney = 7, negativAmount = 4;
        lostMoney = startMoney + negativAmount;
        player.setMoney(startMoney);
        player.setMoney(player.getMoney() - lostMoney);

        //Forventet penge
        expected = -negativAmount;

        assertEquals(expected, player.getMoney(),
                "checks that money can be negative");
        System.out.println("Penge efter test: " + player.getMoney() + " Forventet penge: " + expected);
    }


}