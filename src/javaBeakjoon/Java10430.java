package javaBeakjoon;

import java.util.Scanner;

public class Java10430 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
