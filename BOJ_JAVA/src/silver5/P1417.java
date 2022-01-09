package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1417 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());	// 후보 수
		int d = Integer.parseInt(br.readLine());	// 다솜이가 지지하는 정당 투표수
		int[] votes = new int[N-1];
		int answer = 0;
		
		// 배열에 저장
		for(int i = 0; i < N-1; i++) {
			votes[i] = Integer.parseInt(br.readLine());
		}
		
		if(N == 1) {	// 후보가 한개
			answer = 0;
			bw.write(answer + "\n");
			bw.flush();
			bw.close();
			br.close();
			return;
		}
		
		Arrays.sort(votes);	//오름차순
		
		
		
		while(votes[votes.length-1] >= d)  {	// 다솜정당이 지고있을 경우
			votes[votes.length-1]--;
			d++;
			answer++;

			Arrays.sort(votes);
		}
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
