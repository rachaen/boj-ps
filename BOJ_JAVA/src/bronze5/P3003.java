package bronze5;

import java.util.Scanner;

public class P3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] complete = {1, 1, 2, 2, 2, 8};
		int num = 0;
		
		for (int i = 0 ; i < 6 ; i++) {
			num = sc.nextInt();
			System.out.printf("%d ", complete[i]-num);
		}
	}
}