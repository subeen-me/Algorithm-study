package Algorithm.String;

import java.util.Scanner;

public class 암호 {
    public String solution(int n, String s) {
        String answer = "";
        for(int i=0; i<n; i++) {
            // 0부터 7번 인덱스 전까지 뽑아내고, 특수문자를 숫자로 바꾸는 작업(2진수화)
            String tmp = s.substring(0, 7).replace('#','1').replace('*','0');
            // 10진수화 하는 메소드 이용, 2진수를 10진수화
            int num = Integer.parseInt(tmp, 2);
            // num을 char로 캐스팅해서 대입 누적
            answer += (char)num;
            // s를 7부터 다음 문자열로 초기화
            s = s.substring(7);
        }

        return answer;
    }
    public static void main(String[] args) {
        암호 T = new 암호();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
