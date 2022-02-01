package Algorithm;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public String solution(String str) {
        String answer = "";
        // 스트링을 기반으로 한 문자배열 생성
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt<rt) {
            // 알파벳이 아닐 때 참이 되어야 하므로 ! 사용
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt++;
            }
        }
        //문자배열 s 를 스트링화. static 메소드라 class. 으로 사용
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        특정문자뒤집기 T = new 특정문자뒤집기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
