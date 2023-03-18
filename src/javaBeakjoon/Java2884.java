package javaBeakjoon;

import java.util.Scanner;

public class Java2884 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int h = kb.nextInt();
        int m = kb.nextInt();
        kb.close();

        if(m < 45) {
            h--;
            m = 60 - (45 - m);
            if(h < 0) {
                h = 23;
            }
        } else {
            m = m - 45;
        }
        System.out.println(h + " " + m);
    }
}
