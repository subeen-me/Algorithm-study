package Programmers.level1;

import java.util.HashMap;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], i);
                answer[i] = -1; // 같은 글자 없을 때 -1 추가
            } else {
                answer[i] = i - map.get(arr[i]); // i - map.get(name) :거리 추가
                map.replace(arr[i], i);
            }
        }

        return answer;
    }
}
