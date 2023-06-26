package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String name = br.readLine();
            String num = Integer.toString(i+1);
            map.put(name, num);
            map.put(num, name);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++) {
            String str = br.readLine();
            sb.append(map.get(str) + "\n");
        }
        System.out.println(sb);
    }
}
