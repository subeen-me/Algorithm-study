package javaBeakjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Java15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++) {
            String line = br.readLine();
            st = new StringTokenizer(line, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = a + b;
            bw.write(String.valueOf(result));
            bw.newLine(); //줄바꿈
        }

        bw.flush();
    }
}
