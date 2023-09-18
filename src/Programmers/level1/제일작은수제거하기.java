package Programmers.level1;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {

        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int min = Integer.MAX_VALUE;
        for(int i : arr) {
            if(min > i) min = i;
        }

        int index = 0;
        int[] answer = new int[arr.length-1];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;
    }
}
