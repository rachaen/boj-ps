package BOJ_JAVA.src.bronze;

import java.io.*;
import java.util.Arrays;

public class P2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        String answer = "";

        if(arr2[1] == arr2[0] + 1){
            answer = "ascending";
            for(int i = 1; i < 7; i++) {
                if(arr2[i+1] != arr2[i] + 1) {
                    answer = "mixed";
                    break;
                }
            }
        } else if(arr2[1] == arr2[0] - 1){
            answer = "descending";
            for(int i = 1; i < 7; i++) {
                if(arr2[i+1] != arr2[i] - 1) {
                    answer = "mixed";
                    break;
                }
            }
        } else {
            answer = "mixed";
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
