package bronze4;

import java.util.Scanner;

public class P1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double num = Math.sqrt((Math.pow(d, 2)/(Math.pow(w, 2)+Math.pow(h, 2))));
		System.out.printf("%d %d", (int)Math.floor(num*w), (int)Math.floor(num*h));
		
	}
}
