package BOJ_JAVA.src.silver5;

import java.io.*;

public class P1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        int zero = 0;
        int one = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                if(arr[i] == '0')  zero++;
                else one++;
            }
        }
        if(arr[arr.length-1] =='0') zero++;
        else one++;
        int answer = zero < one ? zero : one;
        bw.write( answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
