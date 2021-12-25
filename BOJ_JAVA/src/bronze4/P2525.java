package bronze4;

import java.util.Scanner;

public class P2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	//시
		int b = sc.nextInt();	//분
		int c = sc.nextInt();	// 몇 분 걸리는 지
		
		System.out.printf("%d %d", ((a + c/60) + (b + c%60)/60)%24, (b + c%60)%60);	// 끝나는 시간
		
	}
}
