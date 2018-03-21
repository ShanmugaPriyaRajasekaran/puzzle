package com.shanmugapriya.test;

import com.shanmugapriya.main.BalancedOrNot;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by shanmugapriya on 21/3/18.
 */

public class BalancedOrNotTest {

    @Test
    public void balancedTest() {

        String expressionsOne[] = {"<>>>","<>>>>"};
        int replacementsOne[] = {2,2};

        String expressionsTwo[]= {"<>","<>><"};
        int replacementsTwo[] = {1,0};

        int resultOne[] = {1,0};
        int resultTwo[] = {1,0};

        assertArrayEquals(resultOne, BalancedOrNot.balancedOrNot(expressionsOne,replacementsOne));
        assertArrayEquals(resultTwo, BalancedOrNot.balancedOrNot(expressionsTwo,replacementsTwo));
    }
}
