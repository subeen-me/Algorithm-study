package javaBeakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java1966 {
    static class Doc {
        int id;
        int priority;
        public Doc(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Doc> docs = new LinkedList<>();

        StringBuilder sb = new StringBuilder();


        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                int pri = Integer.parseInt(st.nextToken());
                docs.offer(new Doc(j, pri));
            }

            int answer = 1;

            while (!docs.isEmpty()) {
                Doc tmp = docs.poll();
                boolean check = true;

                for(Doc x : docs) {
                    if(x.priority > tmp.priority) {
                        check = false;
                        break;
                    }
                }

                if(check == false) {
                    docs.add(tmp);
                }

                else {
                    if(tmp.id == m) {
                        sb.append(answer + "\n");
                    } else {
                        answer++;
                    }
                }

            }
        }

        System.out.println(sb);
    }
}
