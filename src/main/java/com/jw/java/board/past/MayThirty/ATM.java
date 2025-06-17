
package com.jw.java.board.past.MayThirty;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int sum = 0;
        for(int i =0; i<N; i++){
            for(int j=0; j<=i; j++){
                sum+=list.get(j);
            }
        }
        bw.write(String.valueOf(sum));
        bw.close();
        br.close();

    }
}
