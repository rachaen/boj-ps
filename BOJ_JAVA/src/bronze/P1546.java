package BOJ_JAVA.src.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = 0;
        double sum = 0.0;

        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if(value > max) {
                max = value;
            }

            sum += value;
        }
        double answer = ((sum / max) * 100.0) / N;
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
