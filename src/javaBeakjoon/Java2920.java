package javaBeakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Java2920 {
    public static void main(String[] args) {

        //arr int 배열 생성
        int[] arrA = {1,2,3,4,5,6,7,8};
        int[] arrD = {8,7,6,5,4,3,2,1};

        //nums 받아서 배열 생성
        Scanner kb = new Scanner(System.in);
        int[] nums = new int[8];
        for(int i=0; i<nums.length; i++) {
            nums[i] = kb.nextInt();
        }

        //Arrays.equals(a,b) 로 확인
        if(Arrays.equals(nums, arrA)) {
            System.out.println("ascending");
        } else if(Arrays.equals(nums, arrD)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
