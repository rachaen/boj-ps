package bronze4;

import java.util.Scanner;

public class P4299 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int difference = sc.nextInt();
		if(sum - difference < 0 || ((sum-difference) % 2 != 0)) {
			System.out.println(-1);
		} else {
			System.out.printf("%d %d", (sum+difference)/2, (sum-difference)/2);
		}
	}
}
