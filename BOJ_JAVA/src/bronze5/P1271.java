package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger money = sc.nextBigInteger();
		BigInteger num = sc.nextBigInteger();
		
		System.out.println(money.divide(num));
		System.out.println(money.remainder(num));
	}

}
