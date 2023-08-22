package javaBeakjoon;

import java.util.Scanner;

public class Java10870 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        else return fibo(n-2) + fibo(n-1);
    }
}
