package bronze4;

import java.util.Scanner;

public class P2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long answer = sc.nextLong() - sc.nextLong();
		System.out.println(Math.abs(answer));
	}
}
