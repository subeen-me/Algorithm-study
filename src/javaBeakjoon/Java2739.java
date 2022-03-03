package javaBeakjoon;

import java.util.Scanner;

public class Java2739 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int i=1; i<=9; i++) {
            System.out.println(n + " * " + i + " = " +(n*i));
        }
    }
}
