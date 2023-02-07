package javaBeakjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java1152 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());

    }
}
