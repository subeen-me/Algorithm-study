package Algorithm.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
    public static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) queue.offer(i);
        while (!queue.isEmpty()) { //queue가 빌 때까지
            for(int i=1; i<k; i++) queue.offer(queue.poll()); //앞에 있는 걸 뒤로 가져와 다시 넣는다
            queue.poll(); //k번째이므로 poll해서 없애준다
            if(queue.size() == 1) answer = queue.poll(); //마지막 남은 하나를 answer로
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(solution(n,k));
    }
}
