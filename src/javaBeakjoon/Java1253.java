package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java1253 {
    public static void main(String[] args) throws IOException,NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(a);

        for(int k=0; k<n; k++) {
            long find = a[k];
            int i = 0;
            int j = n-1;
            //투 포인터
            while (i<j) {
                if(a[i] + a[j] == find) {
                    //find는 서로 다른 두 수의 합
                    if(i != k && j != k) {
                        result++;
                        break;
                    } else if(i==k) {
                        i++;
                    } else if(j==k) {
                        j--;
                    }
                } else if (a[i]+a[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        br.close();

    }
}
