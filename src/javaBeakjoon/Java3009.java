package javaBeakjoon;

import java.util.Scanner;

public class Java3009 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt();

        int c = kb.nextInt();
        int d = kb.nextInt();

        int e = kb.nextInt();
        int f = kb.nextInt();

        int x = a;
        int y = b;

        if(x == c) {
            x = e;
        } else if (x == e) {
            x = c;
        }

        if(y == d) {
            y = f;
        } else if (y == f) {
            y = d;
        }

        System.out.println(x + " " + y);
        kb.close();

    }
}
