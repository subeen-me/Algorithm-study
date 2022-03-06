package javaBeakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java2562 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int result = 0;
        int cnt = 0;
        for(int i =0; i<9; i++) {
            int num = kb.nextInt();
            if(result < num){
                result = num;
                cnt = i+1;
            }
        }
        System.out.println(result);
        System.out.println(cnt);

    }
}
