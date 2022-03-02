package BOJ_JAVA.src.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class P11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
//        System.out.println(factorial(N));
//        System.out.println(factorial(N-K));
//        System.out.println(factorial(K));

        bw.write(String.valueOf(factorial(N)/(factorial(N-K) * factorial(K))));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int factorial(int n) {
        int ans = 1;
        for(int i = 2; i <= n; i++)
            ans *= i;
        return ans;
    }
}
