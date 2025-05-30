package com.jw.java.board.MayThirty;

import java.io.*;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Coin {
    static int N,M;
    static StringTokenizer st;
    static ArrayList<Integer> wallet = new ArrayList<>();
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++ ){
            st= new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            wallet.add(value);
        }

        Collections.sort(wallet, (a,b)-> b-a);
        // a=1 b =2 c =3   a-b b-c 음수 반환 = 순서 유지
        // b-a  a=1 b=2 c=3 2-1 양수= 순서 변경

       calcuration(M);

       bw.write(String.valueOf(sum));
       bw.close();
       br.close();

    }

    public static void calcuration(int a){
        int account =a;
        for(int value : wallet){

            sum+=account/value;
            account%=value;
        }
    }
}
