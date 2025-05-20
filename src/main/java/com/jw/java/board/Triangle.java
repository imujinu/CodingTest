package com.jw.java.board;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] numbers = new int[3];

            numbers[0] = Integer.parseInt(st.nextToken());
            numbers[1] = Integer.parseInt(st.nextToken());
            numbers[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(numbers);

            int a = numbers[0];
            int b = numbers[1];
            int c = numbers[2];

            if(a==0 && b==0 && c==0)break;

            if(c*c == a*a + b*b)  bw.write("right"+"\n");

            else bw.write("wrong"+"\n");
        }
            bw.close();
            br.close();

    }
}
