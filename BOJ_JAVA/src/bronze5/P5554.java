package bronze5;

import java.util.Scanner;

public class P5554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int minutes = 0;
		int seconds = 0;
		for(int i = 0; i < 4; i++) {
			sum += sc.nextInt();
		}
		minutes = sum / 60;
		seconds = sum % 60;
		System.out.println(minutes);
		System.out.println(seconds);
	}
}
