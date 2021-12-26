package bronze4;

import java.util.Scanner;

public class P2530 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.printf("%d %d %d", (a + (b + d / 60 + (c + d % 60)/60) / 60)%24, (b + d / 60 + (c + d % 60)/60) % 60, (c + d % 60)%60);
	}
}
