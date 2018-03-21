package com.shanmugapriya.test;

import com.shanmugapriya.main.ConsecutiveSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shanmugapriya on 19/3/18.
 */

    public class ConsecutiveSumTest {


    @Test
    public void consecutiveSumTest() {

        int firstValue = 15;
        int secondValue = 10;
        assertEquals(3, ConsecutiveSum.countConsecutive(firstValue));
        assertEquals(1, ConsecutiveSum.countConsecutive(secondValue));
    }
}
