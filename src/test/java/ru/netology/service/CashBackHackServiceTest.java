package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashBackHackServiceTest {

    @Test
    public void shouldCalculateCashBack() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashBackIfAmountLess1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }
}