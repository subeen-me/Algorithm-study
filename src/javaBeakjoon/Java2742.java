package javaBeakjoon;

import java.util.Scanner;

public class Java2742 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int i=0; i<n; i++){
            System.out.println(n-i);
        }
    }
}
