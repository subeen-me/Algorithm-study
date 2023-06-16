package javaBeakjoon;

import java.util.Scanner;

public class Java5073 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        boolean isTriangle = true;

        while (isTriangle) {

            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();

            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a >= b+c || b >= a+c || c >= a+b) {
                System.out.println("Invalid");
            } else if (a == b && b == c && a == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else if (a != b && b != c && a != c) {
                System.out.println("Scalene");
            }
        }

        kb.close();
    }
}
