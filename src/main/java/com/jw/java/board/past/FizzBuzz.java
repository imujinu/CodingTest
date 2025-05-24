package com.jw.java.board.past;

import java.io.*;
import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] og = new String[3];
        for (int i =0; i<3; i++){
            og[i]=br.readLine();

        }
        String[] list = new String[3];
        for(int i=0; i<1000000; i++){
            list[0]= Fizzbuzz(i);
            list[1]=Fizzbuzz(i+1);
            list[2]=Fizzbuzz(i+2);
            if(Arrays.equals(og, list)){
                bw.write(Fizzbuzz(i+3));
                break;
            };
        }
        bw.close();
        br.close();

    }
    public static String Fizzbuzz(int num){
        String result = "";
            if(num%15==0)result= "FizzBuzz";
            else if(num%3==0)result = "Fizz";
            else if(num%5==0)result = "Buzz";
            else result = String.valueOf(num);
        return result;
    }

}
