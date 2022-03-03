package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //for문으로 계속 같은 수를 %10을 이용해 일의 자리 수만 남기면서 곱한다
            int result = 1;
            for(int j = 0; j<b; j++) {
                result = (result * a) % 10;
            }
            if(result==0) { //결과값이 0이면 10을 출력
                System.out.println(10);
            } else { //결과값이 1~9이면 그대로 출력
                System.out.println(result);
            }
        }

    }
}
