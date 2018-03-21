package com.shanmugapriya.main;

/**
 * Created by shanmugapriya on 19/3/18.
 */
public class InTheFuture {

    public static int minNum(int A, int K, int P) {
        if (A >= K)
            return -1;
        int days = 0;
        int ashaProblems = P;
        int kellyProblems = 0;

        while (kellyProblems <= ashaProblems) {
            days++;
            kellyProblems += K;
            ashaProblems += A;
        }
        return days;
    }
}
