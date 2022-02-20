package BOJ_JAVA.src.bronze;

import java.io.*;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        for(int i = 0; i < N; i++) {
            int sum = 0;
            int num = i;
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == N){
                answer = i;
                break;
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
