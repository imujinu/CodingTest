package com.jw.java.board;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int range = Integer.parseInt(br.readLine());

        double[] scores = new double[range];
        StringTokenizer st = new StringTokenizer(br.readLine());

        double max = 0;
        double sum = 0;
        for (int i=0; i<range; i++){
            Double score = Double.parseDouble(st.nextToken());
            sum+=score;
            if(score>max) max = score;
        }
        double avg = sum/max*100/scores.length;

        bw.write(String.valueOf(avg));
        bw.close();
        br.close();





    }
}
