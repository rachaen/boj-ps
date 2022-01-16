package BOJ_JAVA.src.bronze;

import java.io.*;

public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();

        int sum = 0;

        for (byte value: br.readLine().getBytes()) {
            sum += (value - '0');
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
