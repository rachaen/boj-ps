package bronze4;

import java.util.Scanner;

public class P5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0; // 민국 총점
		int man = 0; // 만세 총점
		for (int i = 0; i < 4; i++) {
			min += sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			man += sc.nextInt();
		}
		
		System.out.println(Math.max(min, man));
	}
}
