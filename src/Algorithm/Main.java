package Algorithm;

import java.util.Scanner;

public class 유효한팰린드롬 {
    public String solution(String str){
        String answer = "NO";
        // 대소문자 구분 없으니 다 대문자로 바꾸고, 알파벳만 빼고 다른 특수문자는 replace로 제거
        // 정규식 사용. 알파벳 A부터 Z까지가 아니면 이라는 뜻. 아니면 제거
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer ="YES";

        return answer;
    }

    public static void main(String[] args) {
        유효한팰린드롬 T = new 유효한팰린드롬();
        Scanner kb = new Scanner(System.in);
        // 띄어쓰기가 있으면 한 줄을 읽어야 한다.
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
