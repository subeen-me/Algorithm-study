package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java10989 {
    public static void main(String[] args) throws IOException {
        int[] cnt = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i=1; i<10001; i++) {
            while (cnt[i] > 0) { //i값의 개수가 0이 될 때 까지 출력
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
