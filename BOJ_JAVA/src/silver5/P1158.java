package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		bw.write('<');
		while(q.size() > 1) {
			for(int i = 0; i < K-1; i++) {
				int num = q.poll();
				q.offer(num);
			}
			bw.write(q.poll() + ", ");
		}
		bw.write(q.poll().toString());
		bw.write('>');
		bw.flush();
		bw.close();
		br.close();
		
	}
}
