package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1010 {
	static int[][] dp = new int[30][30];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int N;
		int M;
		int answer = 0;
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; i++ ) {
			
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			bw.write(combi(M,N)+"\n");	// M개 중에서 N개를 뽑는다.
			answer = 0;
		}
		bw.flush();
		br.close();
		bw.close();
	}
	
	static int combi(int n, int r) {
		// 이미 풀린 경우
        if(dp[n][r] > 0) {
        	return dp[n][r];
        }
        //nC0 = nCn = 1
        if(n==r || r ==0) {
        	return dp[n][r] = 1;
        }
        //nCr = n-1Cr-1 + n-1Cr
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}
}
