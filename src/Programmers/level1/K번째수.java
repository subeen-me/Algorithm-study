package Programmers.level1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) { //commands 갯수(50이하)
            for(int j=0; j<3; j++) { //array 안에 돌기
                int I = commands[i][0];
                int J = commands[i][1];
                int K = commands[i][2];
                int[] arr = Arrays.copyOfRange(array, I-1, J); //array 자르기
                Arrays.sort(arr); //배열 오름차순 정렬
                answer[i] = arr[K-1];
            }
        }

        return answer;
    }
}
