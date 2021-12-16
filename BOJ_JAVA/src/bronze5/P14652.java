package bronze5;

import java.util.Scanner;

public class P14652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		System.out.printf("%d %d",k/m, k%m );
	}
}
