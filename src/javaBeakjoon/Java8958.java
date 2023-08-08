package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            String str = br.readLine();
            char[] arr =  str.toCharArray();
            int score = 1;
            int answer = 0;
            for(char c : arr) {
                if(c == 'O') {
                    answer += score;
                    score++;
                } else {
                    score = 1;
                }
            }
            sb.append(answer + "\n");
        }

        System.out.println(sb);

    }
}
