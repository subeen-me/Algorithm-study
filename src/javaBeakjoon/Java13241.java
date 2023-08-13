package javaBeakjoon;

import java.util.Scanner;

public class Java13241 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        long num1 = kb.nextLong();
        long num2 = kb.nextLong();

        long gcd = getGCD(Math.max(num1, num2), Math.min(num1, num2));

        System.out.println((num1*num2)/gcd);
    }

    public static long getGCD(long a, long b) {
        while (b>0) {
            long tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
}
