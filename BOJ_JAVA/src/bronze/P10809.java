package BOJ_JAVA.src.bronze;

import java.io.*;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = br.readLine();

        for (int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(arr[ch-'a']==-1){
                arr[ch-'a'] = i;
            }
        }
        for (int val : arr) {
            bw.write(val + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
