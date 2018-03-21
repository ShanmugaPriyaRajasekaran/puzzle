package com.shanmugapriya.main;

/**
 * Created by shanmugapriya on 19/3/18.
 */

public class BuyingShowTickets {

    public static int waitingTime(int[] tickets, int p) {
        int waitingTime = 0;
        while (tickets[p] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    tickets[i]--;
                    waitingTime++;
                }
                if (i == p && tickets[i] == 0) //Do not wait till the while breaks. Can be removed
                    return waitingTime;
            }
        }
        return waitingTime;
    }
}
