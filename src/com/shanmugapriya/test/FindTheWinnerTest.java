package com.shanmugapriya.test;

import com.shanmugapriya.main.FindTheWinner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shanmugapriya on 20/3/18.
 */
    public class FindTheWinnerTest {

    @Test
    public void winnerTest() {

        int andrea[] = {1, 2, 3};
        int maria[] = {2, 1, 3};

        assertEquals("Maria", FindTheWinner.winner(andrea, maria, "Even"));
        assertEquals("Andrea", FindTheWinner.winner(andrea, maria, "Odd"));
    }
}
