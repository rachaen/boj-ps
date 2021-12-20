package bronze4;

import java.util.Scanner;

public class P1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		String sign = (a > b) ? ">": ((a==b) ? "==" : "<"); 
		System.out.println(sign);
	}

}
