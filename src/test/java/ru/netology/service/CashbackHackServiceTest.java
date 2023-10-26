package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void testCashbackBelowLimit() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 900;
        int actual = service.remain(boundary);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testCashbackAccrued() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 1000;
        int actual = service.remain(boundary);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testCashbackWhenBoundaryZero() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 0;
        int actual = service.remain(boundary);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testCashbackAboveLimit() {
        CashbackHackService service = new CashbackHackService();
        int boundary = 1001;
        int actual = service.remain(boundary);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
