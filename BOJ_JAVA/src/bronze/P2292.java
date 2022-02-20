package BOJ_JAVA.src.bronze;

import java.io.*;

public class P2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int max = 2;
        int room = 1;
        int answer = 1;
        if(N > 1) {
            while(max<=N) {
                max = max + (6 * room);
                room++;
            }
            answer = room;
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
