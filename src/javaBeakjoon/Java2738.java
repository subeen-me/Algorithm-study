package javaBeakjoon;

import java.util.Scanner;

public class Java2738 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] [] arr1 = new int[n][m];
        int[] [] arr2 = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr1[i][j] = kb.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr2[i][j] = kb.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
                if(j == m-1)
                    System.out.println();
            }
        }

    }
}
