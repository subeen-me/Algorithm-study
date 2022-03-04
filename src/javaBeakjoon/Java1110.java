package javaBeakjoon;

import java.util.Scanner;

public class Java1110 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int count = 0;
        int copy = n; // 원래 숫자가 뭐였는지 기억해놓기 위해

        while (true) {
            copy = ((copy % 10) * 10) + (((copy/10)+(copy%10)) % 10);
            count++;

            if(copy == n){
                break;
            }
        }
        System.out.println(count);
    }
}
