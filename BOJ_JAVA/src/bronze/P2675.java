package BOJ_JAVA.src.bronze;

import java.io.*;

public class P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for(int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++)
                    bw.write(S.charAt(j));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
