package BOJ_JAVA.src.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class P1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int row = Math.min(x, w-x);
        int col = Math.min(y, h-y);

        bw.write(Math.min(row, col) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
