package BOJ_JAVA.src.bronze;

import java.io.*;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sugar = Integer.parseInt(br.readLine());
        int five = sugar/5;
        if(sugar % 5 == 0 && five > 0) {
            bw.write(String.valueOf(five));
            bw.flush();
            bw.close();
            br.close();
            return;
        } else {
            while (five > 0) {
                if((sugar - (5 * five)) % 3 == 0) {
                    bw.write(String.valueOf(five + (sugar - (5 * five)) / 3));
                    bw.flush();
                    bw.close();
                    br.close();
                    return;
                } else {
                    five--;
                }
            }
        }

        if(five ==0) {
            if(five == 0 && sugar % 3 ==0)
                bw.write(String.valueOf(sugar / 3));
            else {
                bw.write(String.valueOf(-1));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
