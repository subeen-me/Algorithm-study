package Programmers.level1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        int n = 0;

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                n = i;
                break;
            }
        }

        answer = "김서방은 "+n+"에 있다";

        return answer;
    }
}
