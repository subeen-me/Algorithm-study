package Programmers.level1;

public class 수박 {
    public String solution(int n) {

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++) {
            if (i%2 != 0) {
                sb.append("수");
            }
            else {
                sb.append("박");
            }
        }

        String answer = sb.toString();

        return answer;
    }
}
