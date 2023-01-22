package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int searchNum = Integer.parseInt(br.readLine());

        for(int j=0; j<arr.length; j++) {
            if(arr[j]==searchNum) {
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
