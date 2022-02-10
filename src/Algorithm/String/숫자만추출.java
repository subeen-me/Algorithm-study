package Algorithm.String;

import java.util.Scanner;

public class 숫자만추출 {
    public int solution(String s) {
        String answer = "";
        for(char x : s.toCharArray()) {
            //digit. x가 숫자냐
            if(Character.isDigit(x)) answer +=x;
        }
        // String을 int 타입으로 바꾼다. 0208 이라도 208로 바꾸어진다.
        return Integer.parseInt(answer);
    }


    /* //s는 문자와 숫자가 섞여있는 문자열
    public int solution(String s) {
        int answer = 0;
        for(char x : s.toCharArray()){
            // 아스키 넘버 이용
            if(x>=48 && x<57) answer=answer*10+(x-48);
        }
        return answer;
    } */

    public static void main(String[] args) {
        숫자만추출 T = new 숫자만추출();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
