package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] a = new int[n]; //재료개수만큼 배열 만든다

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int count = 0;
        int i = 0; //a[0] -> Min
        int j = n-1; //a[n-1] -> Max
        while (i<j) {
            if(a[i] + a[j] < m) {
                i++;
            } else if (a[i] + a[j] > m) {
                j--;
            } else { //a[i] + a[j] = m일 때
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        br.close();

    }
}
