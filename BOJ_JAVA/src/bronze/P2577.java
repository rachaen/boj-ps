package BOJ_JAVA.src.bronze;

import java.io.*;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(val);
        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;
        }
        for (int v : arr) {
            bw.write(v+ "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
