package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class P1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = N;
		for(int i = 0; i < N; i++) {
			boolean group = true;
			String s = br.readLine();	// 문자 받기
			String[] s_array = s.split("");	// 문자 나누기
			List<String> chars = new ArrayList<String>();	// 들어있는 문자 저장용
			
			for(int j = 0; j < s_array.length; j++) {
				if(!chars.contains(s_array[j])) {	// 없는 문자라면 저장
					chars.add(s_array[j]);
				} else if(chars.contains(s_array[j]) && s.charAt(j) != s.charAt(j-1)){	// 저장되어 있지만 맨 끝의 값과 일치하지 않으면 그룹문자x
					group = false;
					break;
				} else if(s.charAt(j)>122 || s.charAt(j)<65) {	// 문자가 아닐 때
					group = false;
					break;
				}
			}
			if(group == false) {
				answer--;
			}
			
		}
		
		//출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(answer+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
