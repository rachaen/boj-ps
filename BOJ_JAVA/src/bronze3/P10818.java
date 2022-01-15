package BOJ_JAVA.src.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }
        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
