package Algorithm.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves) {
            for(int i=0; i<board.length; i++) { //행 크기
                if(board[i][pos-1]!=0) {
                    int tmp = board[i][pos-1]; //인형 발견
                    board[i][pos-1] = 0; //인형 가져온 곳 0으로 초기화
                    if(!stack.isEmpty() && tmp == stack.peek()) { //같은 인ㅎ
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp); //다른 인형은 stack에 push
                    break; //한번 for문을 처리하고 break로 for문을 멈춰야한다!!
                }
            }
        }
        return answer;
    }

}
