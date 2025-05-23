package com.jw.java.board.past;

import java.io.*;
import java.util.StringTokenizer;

public class Welcome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = Integer.parseInt(br.readLine());
        int[] number = new int[6];
            StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<6 ;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for(int num : number){

            sum += (int) Math.ceil(num / (double) t);
        }

                int pNumber = people/p;
                int pNumber2 = people%p;
        bw.write(sum + "\n");
        bw.write(pNumber + " " + pNumber2);
        bw.close();
        br.close();



    }
}
