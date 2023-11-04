package Programmers.level1;

public class 푸드파이트대회 {
    public String solution(int[] food) {
        String left = "";

        //food[i]가 짝수이면 입력, 홀수이면 -1해서 입력. but 0이 되면 제외
        for(int i=1; i<food.length; i++) { //짝수일 때
            if(food[i]%2 == 0){
                for(int j=0; j<food[i]/2; j++){
                    left += i;
                }
            } else if(food[i]%2 != 0 && food[i] !=1) { //홀수일 때
                for(int j=0; j<food[i]/2; j++){
                    left += i;
                }
            }
        }

        StringBuffer sb = new StringBuffer(left);
        String right = sb.reverse().toString();

        String answer = left + "0" + right;

        return answer;
    }
}
