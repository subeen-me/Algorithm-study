package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            //String x를 문자배열로 바꾸어 넣는다
            char[] s = x.toCharArray();
            // reverse 직접 구현
            int lt = 0, rt = x.length()-1;
            while (lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            // 문자배열 s를 스트링화. valueOf는 static 으로 선언된 클래스 메서드 String. 이라 해야한다.
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    /*public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) { //String 객체중 하나인 StringBuilder를 활용
            //StringBuilder 객체를 만들고 reverse로 뒤집고 toString으로 문자열로 변환
            //String은 불변형.값 변경 불가해서 새로운 객체를 계속 만들고 대입해야하는 단점
            //StringBuilder는 처음에 만든 객체로 계속 사용, 메모리 낭비 없음. 연산 많아질 때 쓰면 좋다.
            String tmp = new StringBuilder(x).reverse().toString();
            //ArrayList 추가 메서드로 tmp 대입
            answer.add(tmp);
        }

        return answer;
    } */

    public static void main(String[] args) {
        단어뒤집기 T = new 단어뒤집기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 숫자 읽음
        String[] str = new String[n]; // 읽은 숫자길이의 배열 만듬
        for(int i=0; i<n; i++) { // for문 돌면서 n개의 단어를 하나씩 넣는다
            str[i] = kb.next();
        }
        for(String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
