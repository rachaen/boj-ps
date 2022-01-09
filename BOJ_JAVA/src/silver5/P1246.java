package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1246 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());	// 달걀 개수
		int M = Integer.parseInt(st.nextToken());	// 고객 수
		
		int[] arr = new int[M]; 
		
		for(int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int num = 0;
		int income = 0; //최종 수익
		int price = 0;	//최종 가격
		
		for(int i = 0; i < M; i++) {
			num = arr.length - i < N ? arr[i] * (arr.length-i) : arr[i] * N;
			if(num > income) {
				income = num;
				price = arr[i];
			}
		}
		bw.write(price + " " + income);
		bw.flush();
		br.close();
		bw.close();
	}
}
