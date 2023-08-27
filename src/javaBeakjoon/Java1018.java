package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] arr = new String[N][M];

        for(int i=0; i<N; i++) {
            String str = br.readLine();

            for(int j = 0; j<M; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
            }
        }

        int min = 64;

        for(int i=0; i<N-7; i++) { //세로의 경우의 수
            for(int j=0; j<M-7; j++) { //가로의 경우의 수
                min = Math.min(min, cal(i, j, arr)); //최소값을 저장
            }
        }

        System.out.println(min);

    }

    public static int cal(int x, int y, String[][] WB) {
        int count = 0;

        String color = "W"; //첫 번째 칸을 W를 기준으로 색칠

        for(int i=x; i<x+8; i++) { //시작점부터 8개까지
            for(int j=y; j<y+8; j++) { //시작점부터 8개까지
                if(!WB[i][j].equals(color)) {
                    count++;
                }
                if(color.equals("W")) { //컬러 변경
                    color = "B";
                } else {
                    color = "W";
                }
            }
            if(color.equals("W")) { //줄이 바뀌면 윗칸과 색이 달라야 함, 컬러 변경
                color = "B";
            } else {
                color = "W";
            }
        }
        count = Math.min(count, 64 - count);

        return count;
    }
}
