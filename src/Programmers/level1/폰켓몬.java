package Programmers.level1;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;

        int max = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        //중복을 제거한 set의 크기가 최댓값보다 크면 max 리턴
        if(set.size()>max) {
            answer = max;
        } else { //작으면 set의 사이즈 리턴
            answer = set.size();
        }

        return answer;
    }
}
