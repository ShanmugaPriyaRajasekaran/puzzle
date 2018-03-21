package com.shanmugapriya.main;

import java.io.*;

/**
 * Created by shanmugapriya on 21/3/18.
 */

public class LargeResponses {

    public static void main(String[] args) {

        System.out.println("File:");
        processRecords("/Users/santhoshkumar/Documents/test.txt");

    }


    public static void processRecords(String fileName) {
        int lines = 0;
        long total_bytes = 0;
        int bytes_num = 0;
        String bytes;
        BufferedWriter out = null;
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(fileName));
            for (String line; (line = in.readLine()) != null; ) {
                bytes = line.substring(line.lastIndexOf(" ") + 1);
                bytes_num = Integer.parseInt(bytes);
                if (bytes_num > 5000) {
                    lines++;
                    total_bytes += bytes_num;
                }
            }
            FileWriter fstream = new FileWriter("/Users/santhoshkumar/Documents/bytes_test.txt", true);
            out = new BufferedWriter(fstream);
            out.write(Integer.toString(lines));
            out.write("\n");
            out.write(Long.toString(total_bytes));
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error while reading file");
        }
    }

}


