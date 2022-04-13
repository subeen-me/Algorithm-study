package DoitAlgorithm.chap01;

public class Max3m {

    public static void main(String[] args) {
        System.out.println(max3(3, 5, 10));
        System.out.println(max4(4,5,6,100));
    }

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }


}
