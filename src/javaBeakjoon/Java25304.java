package javaBeakjoon;

import java.util.Scanner;

public class Java25304 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int n = kb.nextInt();
        int result = 0;

        for(int i=0; i<n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            result += (a * b);
        }

        if(x == result) System.out.println("Yes");
        else System.out.println("No");
    }
}
