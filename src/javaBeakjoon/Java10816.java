package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(!map.containsKey(num)) { //없는 숫자라면 key-value 추가
                map.put(num, 1);
            } else { //있는 숫자라면 1을 더한다
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            int num = Integer.parseInt(st2.nextToken());
                sb.append(map.getOrDefault(num, 0)).append(' ');
        }

        System.out.println(sb);
    }
}
