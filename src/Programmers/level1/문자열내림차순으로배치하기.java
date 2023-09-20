package Programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(char a : arr) {
            sb.append(a);
        }

        answer = sb.reverse().toString();

        return answer;
    }
}
