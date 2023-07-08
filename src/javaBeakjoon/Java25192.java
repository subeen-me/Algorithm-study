package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Java25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            String chat = br.readLine();
            if(chat.equals("ENTER")) {
                set = new HashSet<>(); //HashSet 초기화
                continue;
            }
            if(!(set.contains(chat))) {
                set.add(chat);
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
