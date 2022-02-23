package BOJ_JAVA.src.bronze;

import java.io.*;

public class P15829 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        String str = br.readLine();
        long sum = 0;
        double r = 1;

        for(int i=0; i<num; i++) {
            sum += (str.charAt(i)-96)* r;
            r = r*31%1234567891;
        }

        bw.write(String.valueOf(sum%1234567891));
        bw.flush();
        br.close();
        bw.close();
    }
}
