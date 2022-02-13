package BOJ_JAVA.src.bronze;

import java.io.*;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[26];
        String word = br.readLine();
        for(int i = 0; i < word.length(); i++) {
            if('a' <= word.charAt(i) && 'z' >= word.charAt(i))
                arr[word.charAt(i)-97]++;
            else
                arr[word.charAt(i)-65]++;
        }

        int max = -1;
        char answer = '?';
        for(int i = 0; i < 26; i++) {
            if(arr[i] > max){
                max = arr[i];
                answer = (char)(i+65);
            } else if(arr[i]==max){
                answer = '?';
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
