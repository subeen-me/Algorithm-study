package Programmers.level1;

public class 소수찾기lv1 {
    public int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n+1];

        //에라토스테네스의 체 이용
        for(int i=2; i<=n; i++) {
            if(numbers[i] == 0) {
                answer++;
                for(int j=i; j<=n; j=j+i) numbers[j] = 1;
            }
        }

        return answer;
    }
}
