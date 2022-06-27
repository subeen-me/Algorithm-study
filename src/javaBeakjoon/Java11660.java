package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int a[][] = new int[n+1][n+1];
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int d[][] = new int[n+1][n+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                //구간 합 구하기. (합배열 i,j기준 위에값+왼쪽값-중복되는대각선값+인풋값)
                d[i][j] = d[i][j-1] + d[i-1][j] - d[i-1][j-1] + a[i][j];
            }
        }
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            //구간 합 배열 이용
            int result = d[x2][y2] - d[x1-1][y2] - d[x2][y1-1] + d[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
