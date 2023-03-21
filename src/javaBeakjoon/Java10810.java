package javaBeakjoon;

import java.util.Scanner;

public class Java10810 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int i, j, k;

        int[] arr = new int[n+1];

        for(int x=0; x<=n; x++) {
            arr[x] = 0;
        }

        for(int x=0; x<m; x++) {
            i = kb.nextInt();
            j = kb.nextInt();
            k = kb.nextInt();
            for (int y=i; y<=j; y++) {
                arr[y] = k;
            }
        }

        for (int x=1; x<=n; x++) {
            System.out.print(arr[x] + " ");
        }

    }
}
