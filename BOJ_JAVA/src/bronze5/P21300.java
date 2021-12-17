package bronze5;

import java.util.Scanner;

public class P21300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		for (int i = 0 ; i < 6 ; i++) {
			answer += sc.nextInt();
		}
		System.out.println(answer * 5);
	}
}
