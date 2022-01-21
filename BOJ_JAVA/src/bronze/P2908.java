package BOJ_JAVA.src.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int answer = A > B ? A : B;
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
