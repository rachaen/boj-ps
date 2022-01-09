package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1292 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int cur = 1;
        
        for(int i = 1; i <= 1000; i++){
            for(int j = 0; j < cur; j++){
                if(i > 1000) break;
                arr[i] = cur;
                i++;
            }
            cur++;   
            i--;
        }
        
        // 합 구하기
        int sum = 0;
        for(int i = A; i <= B; i++){
            sum += arr[i];
        }
        bw.write(sum + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
