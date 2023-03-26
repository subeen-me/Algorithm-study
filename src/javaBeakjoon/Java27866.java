package javaBeakjoon;

import java.util.Scanner;

public class Java27866 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        int i = kb.nextInt();

        char answer = str.charAt(i-1);

        System.out.println(answer);
        kb.close();
    }
}
