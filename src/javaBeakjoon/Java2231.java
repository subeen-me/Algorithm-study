package javaBeakjoon;

import java.util.Scanner;

public class Java2231 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int result = 0;

        for(int i=0; i<n; i++) {
            int num = i;
            int sum = 0; // 각 자릿수 합 변수

            while (num != 0) {
                sum += num % 10; // 각 자릿수 더하기. 계속해서 일의 자리 숫자를 더한다
                num /= 10; // num이 245라면 차례로 24, 2, 0이 된다.
            }

            if(sum + i == n) { // 생성자 찾았을 경우
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
