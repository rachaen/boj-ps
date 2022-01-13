package BOJ_JAVA.src.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if(minute-45 >= 0) {
            bw.write(hour + " " + (minute-45));
        } else {
            if (hour == 0) {
                bw.write(23 + " " + (minute + 60 - 45));
            } else {
                bw.write((hour-1) + " " + (minute + 60 - 45));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
