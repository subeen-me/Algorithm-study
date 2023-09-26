package Programmers.level1;

public class 이상한문자만들기 {
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                idx++;
            } else {
                arr[i] = arr[i].toLowerCase();
                idx++;
            }
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
