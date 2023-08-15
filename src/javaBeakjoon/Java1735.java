package javaBeakjoon;

import java.util.Scanner;

public class Java1735 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // a1/b1, a2/b2
        int a1 = kb.nextInt();
        int a2 = kb.nextInt();
        int b1 = kb.nextInt();
        int b2 = kb.nextInt();

        a1 = a1*b2 + b1*a2;
        b1 = a2*b2;

        int gcd = gcd(a1, b1); //최대공약수

        System.out.println(a1/gcd + " " + b1/gcd); //기약분수

    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; //나머지

            // gcd(a,b) = GCD(b,r) 이므로 변환
            a = b;
            b = r;
        }
        return a;
    }
}
