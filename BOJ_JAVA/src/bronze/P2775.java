package BOJ_JAVA.src.bronze;

import java.io.*;

public class P2775 {
    public static void main(String[] args) throws IOException {
        int[][] apartmemt = new int[15][15];
        for(int i = 0; i < 15; i++) {
            apartmemt[0][i] = i; // 0층
            apartmemt[i][1] = 1; // i01호
        }

        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                //System.out.println("i = "+i+" j = "+j+" apartment[i][j] = "+apartmemt[i][j]);
                apartmemt[i][j] = apartmemt[i][j-1] + apartmemt[i-1][j];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(apartmemt[k][n]+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
