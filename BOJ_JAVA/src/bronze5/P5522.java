package bronze5;

import java.util.Scanner;

public class P5522 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int answer = 0;
		for(int i = 0 ; i < 5; i++) {
			int temp = sc.nextInt();
			answer += temp;
		}
		System.out.println(answer);
	}
}
