package javaBeakjoon;

import java.util.Scanner;

public class Java3052 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] list = new int[10];
        int[] check = new int[42]; //나머지값 담음

        int cnt = 0; //결과값

        for(int i=0; i<list.length; i++){
            list[i] = kb.nextInt(); //10개의 수 하나씩 list에 담는다

            int num = list[i] % 42; //list 0~9까지 42로 나눈 수를 int값 num에 담는다
            if(check[num] != 1) { //check[] 배열에 num을 넣고, 중복 확인
                check[num] = 1; //중복이 아니라면 check[나머지]에 1을 넣는다
                cnt++; // 중복이 아니라면 서로 다른 나머지에 1 카운트
            }
        }

        System.out.println(cnt);

    }
}
