package javaBeakjoon;

import java.util.Scanner;

public class Java1934 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        StringBuilder sb = new StringBuilder();


        for(int i=0; i<n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();

            int d = gcd(a,b); //최소공약수 구하기

            // 두 수의 곱을 최대공약수로 나눈 것이 최대공배수
            sb.append(a * b / d).append('\n');
        }

        System.out.println(sb);

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
