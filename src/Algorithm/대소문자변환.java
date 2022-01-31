package Algorithm;

import java.util.Scanner;

//1. toCharArray로 문자열을 문자배열로 변환해서 foreach문으로 탐색
//2. 아스키 넘버로 탐색. 대문자:65~90, 소문자:97~122
public class 대소문자변환 {
    public String solution(String str) {
        String answer = "";
        /*for(char x : str.toCharArray()){
            //x가 소문자냐를 확인하고 대문자로 바꾸어 누적
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            //x가 대문자일때 소문자로 바꾸어 누적
            else answer+=Character.toLowerCase(x);
        } */
        for(char x : str.toCharArray()) {
            //소문자만 골라내서 대문자로 누적, char로 캐스팅
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args) {
        대소문자변환 T = new 대소문자변환();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
