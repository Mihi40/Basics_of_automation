package ru.netology.service;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testCashbackBelowLimit() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 900;
        int actual = service.remain(boundary);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testCashbackAccrued() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 1000;
        int actual = service.remain(boundary);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
