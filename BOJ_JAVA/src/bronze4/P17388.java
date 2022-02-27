package BOJ_JAVA.src.bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class P17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        if(S + K + H >= 100) {
            bw.write("OK");
        } else {
            int M = Math.min(Math.min(S, K), H);
            if (M == S)
                bw.write("Soongsil");
            if (M == K)
                bw.write("Korea");
            if (M == H)
                bw.write("Hanyang");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
