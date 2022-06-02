package javaBeakjoon;

import java.util.Scanner;

public class Java11720 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String str = kb.next();
        kb.close();

        int ans = 0;

        for(int i=0; i<n; i++) {
            ans += str.charAt(i) - '0'; //charAt()은 해당 문자의 아스키코드 값을 반환하므로 -48 또는 -'0'을 해주어야 함
        }
        System.out.println(ans);
    }
}
