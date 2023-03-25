package javaBeakjoon;

import java.util.Scanner;

public class Java10811 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n+1];
        int i, j;

        for(int x=0; x<=n; x++) {
            arr[x] = x;
        }

        for(int x=0; x<m; x++) {
            i = kb.nextInt();
            j = kb.nextInt();
            while(i<=j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int x=1; x<=n; x++) {
            System.out.print(arr[x] + " ");
        }

        kb.close();
    }
}