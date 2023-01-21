package javaBeakjoon;

import java.util.Scanner;

public class Java14681 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        int y = kb.nextInt();

        kb.close();

        if(x > 0) {
            if(y > 0) System.out.println("1");
            if(y < 0) System.out.println("4");
        } else {
            if(y > 0) System.out.println("2");
            if(y < 0 )System.out.println("3");
        }

    }
}
