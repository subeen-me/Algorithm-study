package javaBeakjoon;

import java.util.Scanner;

public class Java2444 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        for(int i=1; i<=N; i++) {
            for(int j=0; j<N-i; j++)
                System.out.print(" ");
            for(int j=0; j<i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i=N-1; i>=0; i--){
            for(int j=0; j<N-i; j++)
                System.out.print(" ");
            for(int j=0; j<i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

