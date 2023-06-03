package javaBeakjoon;

import java.util.Scanner;

public class Java2501 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        int cnt = 0;
        int result = 0;

        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                cnt ++;
            }
            if(cnt == k) {
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
