import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ_13023 {
	static HashSet<Integer> set;
	static ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
	static boolean isFound = false;
	private static int N;
	private static boolean[] isVisited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 사람의 수
		int M = Integer.parseInt(st.nextToken()); // 친구관계수
		for (int n = 0; n < N; n++) {
			arrList.add(new ArrayList<Integer>());
		}
		// map에 관계를 저장한다
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			arrList.get(first).add(second);
			arrList.get(second).add(first);
		}
		

		for(int n = 0; n < N; n++) {
			isVisited = new boolean[N];
			isVisited[n] = true;
			go(n, 1);
			if(isFound) {
				break;
			}
		}
		System.out.println(isFound ? 1 : 0);
	}
	
	private static void go(int num, int r) {
		if(isFound) {
			return;
		}
		if(r == 5) {
			isFound = true;
			return;
		} 
		for(int i = 0; i < arrList.get(num).size(); i++) {
			if(!isVisited[arrList.get(num).get(i)]) {
				isVisited[arrList.get(num).get(i)] = true;
				go(arrList.get(num).get(i), r+1);
				isVisited[arrList.get(num).get(i)] = false;
			}
		}
	}
}
