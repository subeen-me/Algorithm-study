package javaBeakjoon;

import java.util.Scanner;

public class Java2750 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = kb.nextInt();
        }
        for (int i=0; i<N-1; i++) {
            for(int j=0; j<N-1; j++) {
                if(A[j]>A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for(int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
    }
}
