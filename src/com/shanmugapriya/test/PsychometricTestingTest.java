package com.shanmugapriya.test;

import com.shanmugapriya.main.PsychometricTesting;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by shanmugapriya on 21/3/18.
 */

public class PsychometricTestingTest {

    @Test
    public void jobOffersTest() {

        int jobOffersOne[] = {1, 3, 5, 6, 8};
        int lowerLimitsOne[] = {2};
        int upperLimitsOne[] = {6};
        int jobOffersTwo[] = {4, 8, 7};
        int lowerLimitsTwo[] = {2, 4};
        int upperLimitsTwo[] = {8, 4};
        int[] resultOne = {3};
        int[] resultTwo = {3, 1};

        assertArrayEquals(resultOne, PsychometricTesting.jobOffers(jobOffersOne, lowerLimitsOne, upperLimitsOne));
        assertArrayEquals(resultTwo, PsychometricTesting.jobOffers(jobOffersTwo, lowerLimitsTwo, upperLimitsTwo));
    }
}
