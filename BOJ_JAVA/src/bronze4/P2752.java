package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2752 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[3];
		String[] s = br.readLine().split(" ");
		for(int i=0; i<3; i++) {
			nums[i] = Integer.parseInt(s[i]);
		}
		
		br.close();
		
		Arrays.sort(nums);
		
		StringBuilder sb = new StringBuilder();

		for(int num : nums) {
			sb.append(num).append(" ");
		}
		System.out.print(sb);
		
	}
}
