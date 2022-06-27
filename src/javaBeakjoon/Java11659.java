package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 누적합 문제
 */
public class Java11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =
                new StringTokenizer(br.readLine()); //첫번째 줄 읽어옴

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] s = new long[n + 1];

        st = new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++) { //i까지 누적합 구하기
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int q=0; q<m; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // a, b사이의 구간합은 array[b]-array[a-1]과 같다
            System.out.println(s[j] - s[i-1]);
        }

    }
}
