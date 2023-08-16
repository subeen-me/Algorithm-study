package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for(int i=0; i<N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for(int i=0; i<N-1; i++){
            int distance = trees[i+1] - trees[i]; //각 가로수 간격
            gcd = gcd(distance, gcd); //간격 중 최대공약수 찾기
        }

        //전체 가로수의 수 = (최대위치-최소위치)/최대공약수+1 이므로 전체 가로수에서 이미 심어져 있는 가로수만 빼서 결과 구한다
        int answer = (trees[N-1]-trees[0])/gcd+1 - N;
        System.out.println(answer);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; //나머지
            a = b;
            b = r;
        }
        return a;
    }
}
