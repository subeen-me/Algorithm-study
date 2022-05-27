package javaBeakjoon;

import java.util.Scanner;

public class Java2675 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt(); // 테스트 갯수

        for(int i=0; i<t; i++) {

            int r = kb.nextInt();
            String str = kb.next();

            for(int j=0; j<str.length(); j++) {
                for(int k=0; k<r; k++) {
                    System.out.print(str.charAt(j));
                }
            }

            System.out.println();

        }
    }
}
