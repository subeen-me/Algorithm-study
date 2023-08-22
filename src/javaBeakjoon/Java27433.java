package javaBeakjoon;

import java.util.Scanner;

public class Java27433 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        System.out.println(factorial(N));
    }

    public static long factorial(int n) {
        if (n < 1){
           return 1;
        }
        return n * factorial(n -1);
    }
}
