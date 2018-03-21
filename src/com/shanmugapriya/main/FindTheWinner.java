package com.shanmugapriya.main;

/**
 * Created by shanmugapriya on 20/3/18.
 */

public class FindTheWinner {

    public static String winner(int[] andrea, int[] maria, String s) {
        int index = s.equals("Even") ? 0 : 1;
        int andreaPoints = 0;
        int mariaPoints = 0;
        for (int i = index; i < andrea.length; i += 2) {
            andreaPoints += (andrea[i] - maria[i]);
            mariaPoints += (maria[i] - andrea[i]);
        }
        if (andreaPoints > mariaPoints)
            return "Andrea";
        else if (mariaPoints > andreaPoints)
            return "Maria";
        else
            return "Tie";
    }
}
