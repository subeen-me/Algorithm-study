package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Java1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            String name = br.readLine();
            set.add(name);
        }

        ArrayList<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++) {
            String str = br.readLine();
            if(set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);
        for(var str : list) {
            sb.append(str + "\n");
        }
        System.out.println(list.size());
        System.out.println(sb);

    }
}
