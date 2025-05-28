package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.StringTokenizer;

public class WordArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());


//            if(i!=0){
//                for(int j=0; j<i; j++){
//                    if(str[j].equals(str[i])){
//                        st = new StringTokenizer(br.readLine());
//                        str[i]=st.nextToken();
//                    }
//                }
//            }

        }

        for(int i=0; i<N-1; i++){
            int lenghth = str[i].length()- str[i+1].length();

            if(lenghth>0){
                String string = str[i];
                str[i] = str[i+1];
                str[i+1] = string;
            }
            else if(lenghth==0){
                for(int j =0; i<str[i].length(); j++ ){
                    int ch1 = str[i].charAt(j) - 'a';
                    int ch2 = str[i+1].charAt(j) - 'a';

                    if(ch1>ch2){
                        String string2 = str[i];
                        str[i] = str[i+1];
                        str[i+1] = string2;
                    }
                }
            }

        }

        for(String string : str){
            bw.write(string+"\n");
        }
        bw.close();
        br.close();


    }
}
