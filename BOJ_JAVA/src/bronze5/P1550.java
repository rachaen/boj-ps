package bronze5;

import java.util.Scanner;

public class P1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		System.out.println(Integer.parseInt(hex, 16));
		
		sc.close();
	}
}
