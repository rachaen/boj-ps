package BOJ_JAVA.src.bronze;

import java.io.*;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int O = 0;
            int sum = 0;
            for(byte value: br.readLine().getBytes()) {
                if(value == 'O') {
                    O++;
                    sum += O;
                } else
                    O = 0;  // O 초기화
            }
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
