package javaBeakjoon;

import java.util.Scanner;

public class Java2438 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int i=1; i<n+1; i++) {
           for(int j=0; j<i; j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
