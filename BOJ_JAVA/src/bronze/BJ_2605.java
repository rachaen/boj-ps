import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ_2605 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		LinkedList<Integer> list = new LinkedList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= nums; i++) {
			int n = Integer.parseInt(st.nextToken());
			move(n, i,list);
		}
		for(int i = 0; i < nums; i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	
	static void move(int n, int num, LinkedList<Integer> list) {
		switch(n) {
		case 0:
			list.add(num);
			break;
		default:
			list.add(list.size()-n, num);
		}
	}
}
