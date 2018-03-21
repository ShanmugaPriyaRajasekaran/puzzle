package com.shanmugapriya.main;

/**
 * Created by shanmugapriya on 21/3/18.
 */
public class PsychometricTesting {

    public static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        int q = Math.min(lowerLimits.length, upperLimits.length); //Just in case lowerLimits and upperLimits are different size
        int results[] = new int[q];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < q; j++) {
                if (scores[i] >= lowerLimits[j] && scores[i] <= upperLimits[j])
                    results[j]++;
            }
        }
        return results;
    }

}
