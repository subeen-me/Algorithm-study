package javaBeakjoon;

import java.util.Scanner;

/**
 * 누적합 문제
 */
public class Java11659 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n+1];

        arr[0] = 0;

        for(int i=1; i<=n; i++) {
            arr[i] = arr[i-1] + kb.nextInt();
        }

        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();

            System.out.println(arr[b] - arr[a-1]);
        }

    }
}
