package bronze4;

import java.util.Scanner;

public class P5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();	// 상덕버거
		int jb = sc.nextInt();	// 중덕버거
		int hb = sc.nextInt(); 	// 하덕버거
		
		int coke = sc.nextInt();
		int cider = sc.nextInt();
		System.out.println(Math.min(sb, Math.min(jb, hb)) + Math.min(coke, cider)-50);
	}
}
