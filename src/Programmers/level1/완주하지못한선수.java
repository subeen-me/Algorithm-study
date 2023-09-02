package Programmers.level1;

import java.util.HashMap;

public class 완주하지못한선수 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<participant.length; i++) {
            String name = participant[i];
            if(!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }

        for(int i=0; i<completion.length; i++) {
            String name = completion[i];
            if(map.containsKey(name)) {
                map.replace(name, map.get(name) -1);
            }
            if(map.get(name).equals(0)) {
                map.remove(name);
            }
        }

        for(String key : map.keySet()) {
            answer = key;
        }

        return answer;
    }

}
