package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P11382 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger result = sc.nextBigInteger().add(sc.nextBigInteger().add(sc.nextBigInteger()));

		
		System.out.println(result);
	}
}
