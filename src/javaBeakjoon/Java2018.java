package javaBeakjoon;

import java.util.Scanner;

public class Java2018 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int count = 1; //자기 자신으로 이루어진 것 카운트하고 시작
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != n) {
            if(sum == n) {
                count++; //count 증가
                end_index++; //end_index 오른쪽으로 한 칸
                sum = sum + end_index; //sum 값 변경
            } else if (sum > n) {
                sum = sum - start_index; //sum값 변경 후에
                start_index++; //start_index 오른쪽으로 한 칸
            } else { //(sum<n)
                end_index++; //end_index 오른쪽으로 한 칸
                sum = sum + end_index; //sum값 변경
            }
        }
        System.out.println(count);
    }
}
