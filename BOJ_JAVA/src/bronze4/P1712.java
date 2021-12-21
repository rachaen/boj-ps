package bronze4;

import java.util.Scanner;

public class P1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int income = c - b;
		
		if(b >= c) {
			System.out.println(-1);
		} else {			
			System.out.println((int)Math.ceil(a/income) + 1);
		}
	}
}
