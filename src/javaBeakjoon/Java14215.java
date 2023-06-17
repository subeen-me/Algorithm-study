package javaBeakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Java14215 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] triangle = new int[3];

        triangle[0] = kb.nextInt();
        triangle[1] = kb.nextInt();
        triangle[2] = kb.nextInt();

        Arrays.sort(triangle);

        if(triangle[0]+triangle[1]>triangle[2]) {
            System.out.println(triangle[0]+triangle[1]+triangle[2]);
        } else {
            System.out.println((triangle[0]+triangle[1])*2-1);
        }

        kb.close();
    }
}
