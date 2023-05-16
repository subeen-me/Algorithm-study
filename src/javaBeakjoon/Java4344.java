package javaBeakjoon;

import java.util.Scanner;

public class Java4344 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] arr;

        int c = kb.nextInt();
        for(int i=0; i<c; i++) {
            int n = kb.nextInt(); //학생 수
            arr = new int[n];

            double sum = 0;

            //성적 입력부분
            for(int j=0; j<n; j++) {
                int val = kb.nextInt(); //성적 입력
                arr[j] = val;
                sum += val; //성적 누적 합
            }

            double mean = (sum / n);
            double count = 0; //평균 넘는 학생 수 변수

            //평균 넘는 학생 비율 찾기
            for (int j=0; j<n; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/n)*100);

        }
        kb.close();
    }
}
