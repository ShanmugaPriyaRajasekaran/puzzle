package com.shanmugapriya.test;

import com.shanmugapriya.main.InTheFuture;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shanmugapriya on 19/3/18.
 */
public class InTheFutureTest {

    @Test
    public void minNumTest() {
        int aOne = 3;
        int kOne = 5;
        int pOne = 1;
        int aTwo = 4;
        int kTwo = 5;
        int pTwo = 1;
        assertEquals(1, InTheFuture.minNum(aOne, kOne, pOne));
        assertEquals(2, InTheFuture.minNum(aTwo, kTwo, pTwo));

    }

}
