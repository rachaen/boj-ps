package BOJ_JAVA.src.bronze;

import java.io.*;

public class P1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        while(!str.equals("0")) {
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            if(str.equals(reverse))
                bw.write("yes\n");
            else
                bw.write("no\n");
            str = br.readLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
