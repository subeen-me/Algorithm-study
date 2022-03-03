package javaBeakjoon;

import java.util.Scanner;

public class Java8393 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int sum = 0;
        for(int i=1; i<n+1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
