package Algorithm;

import java.util.Scanner;

public class 문자거리 {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        // 오른쪽으로 도는 for문
        for (int i = 0; i < s.length(); i++) {
            // t와 같은 문자인지 확인하고 같으면 0을 대입
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }
            // 같은 문자가 아니라면 1씩 증가하고 대입
            else {
                p++;
                answer[i] = p;
            }
        }
        // p 다시 초기화, 오른쪽에서 왼쪽으로 for문
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                // 기존 for문으로 셋팅한 값과 비교하여 작은 값을 넣는다
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        문자거리 T = new 문자거리();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.println(x + " ");
        }
    }
}
