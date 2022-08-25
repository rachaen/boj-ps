import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @date        : 2022. 8. 25.
 * @author      : 이채은
 * @version	:
 */

/**
 * @FileName : BJ_10971.java
 * @Project : algorithm
 * @Date : 2022. 8. 25.
 * @author: 이채은
 * 
 * @version :
 * @program info : 외판원 순회2
 */
public class BJ_10971 {
	private static int[][] weight;
	private static boolean[] visited;
	private static int N;
	private static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		weight = new int[N+1][N+1];
		visited = new boolean[N+1];
		// 1번부터 n번까지의 도시까지 비용을 저장한다.
		for (int r = 1; r <= N; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int c = 1; c <= N; c++) {
				weight[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		
		// DFS를 통해 최소비용을 찾아준다.
		for (int i = 1; i <= N; i++) {
			visited[i] = true;
			go(i, i, 0, 1);
			visited[i] = false;
		}

		System.out.println(min);

	}

	/**
	 * @Method Name  : go 
	 * @Method info : DFS로 최소 비용을 찾아주는 함수
	 * @param start
	 * @param cur
	 * @param sum
	 * @param r
	 */
	public static void go(int start, int cur, int sum, int r) {
		if (r == N) {
			if (weight[cur][start] != 0) {	// 모든 도시를 순회하면 start도시로 다시 돌아간다.
				sum += weight[cur][start];
				if (sum < min)	// 최소값이면 결과값 바꿔주기
					min = sum;
			}
			return;
		}
		
		//DFS
		for (int i = 1; i <= N; i++) {
			if (visited[i] == false && weight[cur][i] != 0) {
				visited[i] = true;
				go(start, i, sum + weight[cur][i], r + 1);
				visited[i] = false;
			}
		}
	}
}
