package javaBeakjoon;

import java.util.Scanner;

public class Java19532 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int d = kb.nextInt();
        int e = kb.nextInt();
        int f = kb.nextInt();

        for(int i=-999; i<=999; i++) {
            for(int j=-999; j<=999; j++) {
                if(a*i+b*j == c && d*i+e*j ==f) {
                    System.out.println(i + " " + j);
                }
            }
        }
        kb.close();
    }
}
