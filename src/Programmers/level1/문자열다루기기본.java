package Programmers.level1;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;

        if(s.length() == 4 || s.length() == 6) {
            for(char c : s.toCharArray()) {
                if(Character.isDigit(c)) cnt++;
            }
            if(cnt == s.length()) {
                answer = true;
            }
        }

        return answer;
    }
}
