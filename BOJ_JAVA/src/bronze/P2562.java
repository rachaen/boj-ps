package BOJ_JAVA.src.bronze;

import java.io.*;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int index = 0;
        for(int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                index = i + 1;
            }
        }

        bw.write(max+"\n"+index);
        bw.flush();
        bw.close();
        br.close();
    }
}
