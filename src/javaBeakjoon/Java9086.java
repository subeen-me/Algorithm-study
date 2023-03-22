package javaBeakjoon;

import java.util.Scanner;

public class Java9086 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();

        for(int i=0; i<t; i++) {
            String str = kb.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }

        kb.close();
    }
}
