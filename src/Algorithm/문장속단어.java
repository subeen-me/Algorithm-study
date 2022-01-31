package Algorithm;

import java.util.Scanner;

// 1. split로 푸는 방법
// 2. indexOf, subString으로 푸는 방법

public class 문장속단어 {
    /*public String solution(String str) {
        String answer = "";
        //숫자의 갯수를 세는 m을 가장 작은 값으로 초기화
        int m = Integer.MIN_VALUE;
        //띄어쓰기로 문자열을 분리시켜 문자배열에 넣는다
        String[] s = str.split(" ");
        for(String x : s) {
            //분리시킨 배열 하나하나의 길이를 정수값 len에 넣는다
           int len = x.length();
           //m보다 len이 크다면 len을 m에 넣고, 답에 대입한다
           if(len>m) {
               m=len;
               answer=x;
           }
        }
        return answer;
    } */

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        //띄어쓰기의 위치를 리턴, 이 값이 띄어쓰기를 발견 못했다면 -1을 리턴
        while ((pos = str.indexOf(' ')) != -1) {
            //인덱스 0번부터 pos 전까지 잘라낸다
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m) { //같거나 크면 안된다. 앞에 탐색한 것이 우선순위가 되기 때문
                m=len;
                answer =tmp;
            }
            //띄어쓰기 +1 뒤부터 다시 잘라내기
            str = str.substring(pos+1);
        }
        //마지막 단어가 str. 마지막 단어가 m보다 크면 str로 바꾸어주어야 한다
        //indexOf, Substring을 이용했을 때는 마지막 단어를 꼭 처리해줘야 한다
        if(str.length()>m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        문장속단어 T = new 문장속단어();
        Scanner kb = new Scanner(System.in);
        //문장을 입력받아야 하기 때문에 nextLine으로 받는다
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
