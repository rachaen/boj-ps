package BOJ_JAVA.src.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class P4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && x == 0 && z == 0) break;

            if(x*x + y*y == z*z)
                bw.write("right"+"\n");
            else if(y*y + z*z == x*x)
                bw.write("right"+"\n");
            else if(z*z + x*x == y*y)
                bw.write("right"+"\n");
            else
                bw.write("wrong"+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
