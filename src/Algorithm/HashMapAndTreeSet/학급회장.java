package Algorithm.HashMapAndTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 학급회장 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //반 학생 수
        int n = Integer.parseInt(br.readLine());
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        String st = br.readLine();

        for(char key : st.toCharArray() ) {
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);

    }
}
