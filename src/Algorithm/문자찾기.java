package Algorithm;

import java.util.Scanner;

public class 문자찾기 {
    public int solution(String str, char t) {
        int answer = 0;
        //str, t를 다 대문자로 만든다
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //1. for문으로 str 문자열 인덱스를 돌리고, if문으로 answer 1씩 증가시킨다
        /*for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == t) answer++;
        }*/
        //2. 향상된 for문 이용하는 방법 foreach에서 오른쪽에 오는 것은 배열이나 iterator를 제공하는 컬렉션프레임워크 등이 와야하고 String 그대로는 안된다.
        //toCharArray()는 String을 캐릭터 배열 객체로 만들어준다.
        for(char x : str.toCharArray()) {
            if(x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자찾기 T = new 문자찾기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        //kb.next로 문자열을 읽어들인 것에서 charAt 이용해서 스트링을 인덱스로 접근
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
