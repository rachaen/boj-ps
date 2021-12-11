package bronze5;

import java.util.Scanner;

public class P3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int average = sc.nextInt();
		
		System.out.print(average * 2 - r1);
	}
}
