package Programmers.level1;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++) {
            String str = "";
            String s1 = getBinary(n, arr1[i]);
            String s2 = getBinary(n, arr2[i]);

            for(int j=0; j<n; j++) {
                if(s1.charAt(j) == '1' || s2.charAt(j) == '1'){
                    str += "#";
                } else {
                    str += " ";
                }
            }
            answer[i] = str;
        }
        return answer;
    }

    private String getBinary(int n, int num) {
        String binary = Integer.toBinaryString(num);
        int len = binary.length();
        for(int i=0; i<n-len; i++) binary = "0" + binary;
        return binary;
    }
}
