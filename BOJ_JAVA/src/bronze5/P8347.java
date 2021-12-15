package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P8347 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		BigInteger apples = sc.nextBigInteger();
		BigInteger diff = sc.nextBigInteger();
		BigInteger two = new BigInteger("2");
		
		System.out.println((apples.subtract(diff)).divide(two).add(diff));
		System.out.println((apples.subtract(diff)).divide(two));
	}

}
