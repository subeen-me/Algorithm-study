package javaBeakjoon;

import java.util.Scanner;

public class Java2908 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int A = kb.nextInt();
        int B = kb.nextInt();

        kb.close();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.println(A > B ? A : B);

    }
}
