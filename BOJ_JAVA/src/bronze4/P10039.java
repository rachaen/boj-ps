package bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10039 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int answer = 0;
		for(int i = 0; i < 5; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num<40) {
				num = 40;
			}
			answer += num;
		}
		bw.write(answer/5 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
