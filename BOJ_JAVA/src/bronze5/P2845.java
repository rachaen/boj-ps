package bronze5;

import java.util.Scanner;

public class P2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int area = sc.nextInt();
		
		for (int i = 0; i < 5; i++) {
			int article = sc.nextInt();
			System.out.printf("%d ", article - num * area);
		}
	}
}
