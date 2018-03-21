package com.shanmugapriya.test;

import com.shanmugapriya.main.BuyingShowTickets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shanmugapriya on 19/3/18.
 */
public class BuyingShowTicketsTest {

    @Test
    public void waitingTimeTest() {
        int ticketsOne[] = {2, 6, 3, 4, 5};
        int positionOfJesseOne = 2;
        int ticketsTwo[] = {1, 1, 1, 1, 1};
        int positionOfJesseTwo = 0;
        int ticketsThree[] = {5, 5, 2, 3};
        int positionOfJesseThree = 3;

        assertEquals(12, BuyingShowTickets.waitingTime(ticketsOne, positionOfJesseOne));
        assertEquals(1, BuyingShowTickets.waitingTime(ticketsTwo, positionOfJesseTwo));
        assertEquals(11, BuyingShowTickets.waitingTime(ticketsThree, positionOfJesseThree));
    }
}
