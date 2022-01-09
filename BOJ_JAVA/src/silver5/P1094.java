package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1094 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		int answer = 0;
		int bar = 64;
		while(X > 0) {
			if(bar > X) {
				bar /= 2;
			} else {
				X -= bar;
				answer++;
			}
		}
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
