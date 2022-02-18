package BOJ_JAVA.src.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class P10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int H = Integer.parseInt(st.nextToken());
            st.nextToken(); // w
            int N = Integer.parseInt(st.nextToken());

            if(N%H == 0) {
                bw.write(((H * 100) + (N / H))+"\n");
            } else {
                bw.write((((N % H) * 100) + ((N / H) + 1))+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
