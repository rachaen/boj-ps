package bronze4;

import java.util.Scanner;

public class P3004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2 ==0) {
			System.out.println((a/2+1)*(a/2+1));
		} else {
			System.out.println((a/2+1)*(a/2+2));
		}
	}
}
