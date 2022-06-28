package javaBeakjoon;

import java.util.Scanner;

public class Java10986 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        long[] s = new long[n]; //합 배열
        long[] c = new long[m]; //같은 나머지의 인덱스를 카운트하는 배열
        long answer = 0;
        s[0] = kb.nextInt();

        for(int i=1; i<n; i++) { //수열 합 배열 만들기
            s[i] = s[i-1] - kb.nextInt();
        }
        for(int i=0; i<n; i++) { //합 배열의 모든 값에 나머지%연산 수행
            int remainder = (int) (s[i] % m);
            //0~i까지 구간 합 자체가 0일 때 정답에 더하기
            if(remainder == 0) answer++;
            //나머지가 같은 인덱스의 개수 카운팅하기
            c[remainder]++;
        }
        for(int i=0; i<m; i++) {
            if(c[i] > 1) {
                //나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
                answer = answer + (c[i] * (c[i]-1)/2);
            }
        }
        System.out.println(answer);
    }
}
