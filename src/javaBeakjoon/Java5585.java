package javaBeakjoon;

import java.util.Scanner;

public class Java5585 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = 1000 - kb.nextInt();
        int cnt = 0;

        int[] coins = {500, 100, 50, 10, 5, 1};

        for (int coin : coins) {
            if(coin > n)
                continue;
            cnt += n / coin; //cnt 변수에 나눈 값을 계속 더해주면 사용된 거스름돈의 갯수만큼 cnt애 저장
            n %= coin;
        }
        System.out.println(cnt);

    }
}
