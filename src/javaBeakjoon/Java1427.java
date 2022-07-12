package javaBeakjoon;

import java.util.Scanner;

public class Java1427 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int[] A = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for(int i=0; i<str.length(); i++) {
            int Max = i;
            for(int j= i+1; j<str.length(); j++) {
                if(A[j] > A[Max]) //내림차순으로 최댓값을 찾음
                    Max = j;
            }
            if(A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        for(int i=0; i<str.length(); i++) {
            System.out.println(A[i]);
        }
    }
}
