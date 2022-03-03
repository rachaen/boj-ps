package BOJ_JAVA.src.silver5;

import java.io.*;

public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] people = new int[N][2];

        String[] person;
        for(int i = 0; i < N; i++) {
            person = br.readLine().split(" ");
            people[i][0] = Integer.parseInt(person[0]);
            people[i][1] = Integer.parseInt(person[1]);
        }

        for(int i = 0; i < N; i++) {
            int rank = 1;

            for(int j = 0; j < N; j++) {
                if(i==j) continue;
                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++;
                }
            }

            bw.write(String.valueOf(rank));
            bw.write(String.valueOf(' '));
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
