package Programmers.level1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {

        int d = gcd(n,m); //최대공약수

        int[] answer = {d, n*m/d};

        return answer;
    }

    public static int gcd(int a, int b) {
        while(b!=0) {
            int r = a % b; //나머지

            a = b;
            b = r;
        }
        return a;
    }
}
