package Algorithm.String;

import java.util.Scanner;

public class 문자열압축 {
    public String solution(String s) {
        String answer = "";
        // arrayOutOfIndex error 를 피하기 위해 인덱스 맨 마지막에 빈 문자 추가
        s = s+" ";
        int cnt = 1;
        // 반복은 마지막 빈문자열 전까지만 해야하므로 s.length()-1 을 해준다.
        for(int i=0; i<s.length()-1; i++){
            // i 문자와 그 다음이 같다면 숫자 카운트
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            // 아니라면 i 문자를 answer 에 누적
            else {
                answer += s.charAt(i);
                // cnt가 1보다 클 경우에만 인트 타입을 스트링으로 바꾸어서 누적
                if(cnt>1) answer+=String.valueOf(cnt);
                // cnt를 1로 다시 초기화
                cnt = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문자열압축 T = new 문자열압축();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
