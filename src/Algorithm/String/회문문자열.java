package Algorithm.String;

import java.util.Scanner;

public class 회문문자열 {
    public String solution(String str) {
        String answer = "YES";
        // 스트링빌더로 객체생성, 뒤집고 다시 스트링으로 바꾼다
        String tmp = new StringBuilder(str).reverse().toString();
        // 대소문자인지 구분하지 않는 이퀄스 메소드
        if(!str.equalsIgnoreCase(tmp)) answer = "NO";
        return answer;
    }

    /* public Algorithm.String solution(Algorithm.String str) {
        Algorithm.String answer = "YES";
        // 다 대소문자로 바꾼다
        str = str.toUpperCase();
        // 문자열의 길이값
        int len = str.length();
        // 문자열 길이/2가 i보다 클때까지만 비교
        for(int i=0; i<len/2; i++) {
            //오른쪽 값은 맨 마지막 인덱스. i가 커질수록 숫자가 작아질것
            if(str.charAt(i)!= str.charAt(len-i-1)) return "NO";
        }

        return answer;
    } */

    public static void main(String[] args) {
        회문문자열 T = new 회문문자열();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
