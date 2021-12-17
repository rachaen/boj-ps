package bronze5;

import java.util.Scanner;

public class P14928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.next();
        long remain = 0;
        for (int i = 0; i < input.length(); i++) {
        	remain = (remain * 10 + (input.charAt(i) - '0')) % 20000303;
        }
        
        System.out.println(remain);
	}
}

// remain * 10 => 자리수를 늘려주기 위해서
// '0' => 아스키코드값 48