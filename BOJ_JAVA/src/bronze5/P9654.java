package bronze5;

public class P9654 {
	public static void main(String[] args) {
		String[][] nabu = {{"N2 Bomber","Heavy Fighter","Limited","21"},
				{"J-Type 327","Light Combat","Unlimited","1"},
				{"NX Cruiser","Medium Fighter","Limited","18"},
				{"N1 Starfighter","Medium Fighter","Unlimited","25"},
				{"Royal Cruiser","Light Combat","Limited","4"}};
		System.out.println(String.format("%-15s%-15s%-11s%-10s", "SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE"));
		for(int i = 0; i < 5; i++) {
				System.out.println(String.format("%-15s%-15s%-11s%-10s", nabu[i][0], nabu[i][1], nabu[i][2], nabu[i][3]));

		}
	}
}
