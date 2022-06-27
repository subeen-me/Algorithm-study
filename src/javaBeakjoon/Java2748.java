package javaBeakjoon;

import java.util.Scanner;

public class Java2748 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        long[] a = new long[n+1];

        a[0] = 0;
        a[1] = 1;
        for(int i=2; i<=n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        System.out.println(a[n]);
    }
}
