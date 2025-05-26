package com.jw.java.board.now;

import java.io.*;
import java.math.BigInteger;

public class Hash {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        BigInteger sum = BigInteger.ZERO;
        BigInteger pow = BigInteger.valueOf(31);
        BigInteger mod = BigInteger.valueOf(1234567891L);
        for(int i=0; i<N; i++){
            char ch = str.charAt(i);
            int number = ch-'a' + 1;
            BigInteger num = pow.pow(i);
           sum = sum.add(num.multiply(BigInteger.valueOf(number)));
           sum =sum.mod(mod);
        }
        bw.write(sum.toString());
        bw.close();
        br.close();
    }
}
