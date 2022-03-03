package javaBeakjoon;

import java.util.Scanner;

public class Java11021 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        for(int i=0; i<n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            System.out.println("Case #"+ (i+1) + ": " + (a+b));
        }
    }
}
