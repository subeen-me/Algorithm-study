package Programmers.level1;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 1;
        int cnt = 1;

        char[] arr = s.toCharArray();
        char x = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(cnt == 0) {
                answer++;
                x = arr[i];
            }

            if(arr[i] == x) {
                cnt ++;
            } else {
                cnt --;
            }

        }

        return answer;
    }
}
