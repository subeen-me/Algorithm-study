package Programmers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);
        String[] arr = str.split("");

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(String aArr : arr) {
            sb.append(aArr);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}
