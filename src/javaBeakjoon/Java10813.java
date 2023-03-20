package javaBeakjoon;

import java.util.Scanner;

public class Java10813 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n+1];

        for (int i=1; i<=n; i++) {
            arr[i] = i;
        }

        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for (int i=1; i<=n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
