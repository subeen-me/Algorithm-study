package Programmers.level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";

        int n = s.length();
        int mid = n/2;

        if(n % 2 == 0) {
            answer = s.substring(mid-1, mid+1);
            return answer;
        }

        answer = s.substring(mid, mid+1);

        return answer;
    }
}
