package Algorithm.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        // 리턴값 answer 초기화
        String answer = "";
        // 정수 m을 정수값 최소값으로 초기화
        int m = Integer.MIN_VALUE;
        // 입력받은 문자열을 띄어쓰기로 나누어 문자배열 객체 생성
        String[] s = str.split(" ");
        // 향상된 for 문으로 문자배열 객체 돌기
        for(String x : s) {
            // 배열객체의 길이를 정수값에 담기
            int len = x.length();
            // 배열객체의 길이가 m보다 크다면 m에 배열객체의 길이를 담고, 리턴값 answer에 현재 객체 대입하는 if문
            if(len>m) {
                m = len;
                answer = x;
            }
        }
        // answer를 값으로 리턴
        return answer;
    }
}
