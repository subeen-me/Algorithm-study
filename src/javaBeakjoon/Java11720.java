package javaBeakjoon;

import java.util.Scanner;

public class Java11720 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String num = kb.next();

        int ans = 0;

        for(int i=0; i<n; i++) {
            ans += num.charAt(i) - '0';
        }

        System.out.println(ans);
    }
}
