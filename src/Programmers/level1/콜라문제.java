package Programmers.level1;

public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(true) {

            if(n<a) {
                break;
            }

            answer += (n/a) * b; //받은 콜라 수
            int remain = n % a;
            n = ((n/a)*b) + remain; //빈병개수+나머지병개수

        }

        return answer;
    }
}
