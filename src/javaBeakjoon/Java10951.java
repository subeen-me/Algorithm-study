package javaBeakjoon;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Java10951 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            try {
                int a = kb.nextInt();
                int b = kb.nextInt();
                System.out.println(a + b);
            } catch (NoSuchElementException e) {
                break;
            }
        }
    }
}
