package Programmers.level1;

public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] arr = {"aya", "ye", "woo", "ma"};

        for(String s : babbling) {
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }

            for(int i=0; i<arr.length; i++) {
                s = s.replace(arr[i], " ");
            }
            s = s.replace(" ", "");
            if(s.length() == 0) answer++;
        }

        return answer;
    }
}
