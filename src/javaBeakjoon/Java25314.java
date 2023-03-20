package javaBeakjoon;

import java.util.Scanner;

public class Java25314 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int cnt = n / 4;

        for(int i=0; i<cnt; i++) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}
