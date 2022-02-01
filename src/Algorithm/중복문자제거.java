package Algorithm;

import java.util.Scanner;

public class 중복문자제거 {
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            //indexOf 사용해서 알파벳이 처음 발견된 인덱스 번호와 지금 인덱스가 같다면 중복 확인
            if(str.indexOf(str.charAt(i))==i) answer+= str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        중복문자제거 T = new 중복문자제거();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
