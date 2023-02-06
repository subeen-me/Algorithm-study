package javaBeakjoon;

import java.util.Scanner;

public class Java2475 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int d = kb.nextInt();
        int e = kb.nextInt();
        int answer = ((a*a) + (b*b) + (c*c) + (d*d) + (e*e))%10;
        System.out.println(answer);
    }
}
