package BOJ_JAVA.src.bronze4;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P16428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        //A와 B가 음수 양수 일때 조건을 나누고 연산 출력
        if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == -1) {
            bw.write(String.valueOf((A.divide(B)).add(BigInteger.ONE)));
            bw.write("\n");
            bw.write(String.valueOf(((A.remainder(B)).subtract(B))));
            bw.write("\n");
        }else if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == 1){
            bw.write(String.valueOf((A.divide(B)).subtract(BigInteger.ONE)));
            bw.write("\n");
            bw.write(String.valueOf(((A.remainder(B)).add(B))));
            bw.write("\n");
        }else {
            bw.write(String.valueOf(A.divide(B)));
            bw.write("\n");
            bw.write(String.valueOf(A.remainder(B)));
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
