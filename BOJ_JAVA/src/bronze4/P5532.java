package bronze4;

import java.util.Scanner;

public class P5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();	// 방학 일수
		int A = sc.nextInt();	// 국어 총 페이지
		int B = sc.nextInt();	// 수학 총 페이지
		int C = sc.nextInt();	// 국어 하루 최대 페이지
		int D = sc.nextInt();	// 수학 하루 최대 페이지
		
		int Korean = 0;
		int Math = 0;
		if(A % C != 0) {
			Korean = A / C + 1;
		} else {
			Korean = A / C;
		}
		
		if(B % D != 0) {
			Math += B / D + 1;
		} else {
			Math += B / D;
		}
		
		System.out.println(L - (Korean > Math ? Korean : Math));
	}
}
