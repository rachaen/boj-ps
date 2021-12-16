package bronze5;

public class P10170 {
	public static void main(String[] args) {
		System.out.println(String.format("%-15s%-4s%-3s%s\n-----------------------", "NFC West","W","L","T"));
		
		
		String[][] west = {{"Seattle","13","3","0"},{"San Francisco","12","4","0"},{"Arizona","10","6","0"},{"St. Louis","7","9","0"}};
		String[][] north = {{"Green Bay","8","7","1"},{"Chicago","8","8","0"},{"Detroit","7","9","0"},{"Minnesota","5","10","1"}};
		
		for(int i = 0; i < 4 ; i++) {
			System.out.println(String.format("%-15s%-4s%-3s%s", west[i][0],west[i][1],west[i][2],west[i][3]));
		}
		
		System.out.println(String.format("\n%-15s%-4s%-3s%s\n-----------------------", "NFC North","W","L","T"));
		for(int i = 0; i < 4 ; i++) {
			System.out.println(String.format("%-15s%-3s%2s%3s", north[i][0],north[i][1],north[i][2],north[i][3]));
		}
	}
}
