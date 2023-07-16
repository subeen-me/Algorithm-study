package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Java26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        StringTokenizer st;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(a.equals("ChongChong")) {
                set.add(a);
                set.add(b);
            }
            if(b.equals("ChongChong")) {
                set.add(a);
                set.add(b);
            }
            if(set.contains(a)) {
                set.add(b);
            }
            if(set.contains(b)) {
                set.add(a);
            }

        }

        System.out.println(set.size());

    }
}
