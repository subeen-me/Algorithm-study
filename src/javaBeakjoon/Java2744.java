package javaBeakjoon;

import java.util.Scanner;

public class Java2744 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        System.out.println(answer);

    }
}
