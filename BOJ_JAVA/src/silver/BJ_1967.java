import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 * 
 * @author 이채은
 *
 */
public class BJ_1697 {
	private static final int MAX = 100001;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		boolean[] visited = new boolean[MAX]; /** 방문체크 */

		int[] cnt = new int[MAX]; // 걸음 수 저장

		Queue<Integer> subin = new LinkedList<>(); /** 이동하기 위해 있는 지점을 저장하는 큐 */
		visited[N] = true; // 시작 지점 방문체크
		subin.add(N); // 시작 지점을 큐에 넣어주기

		while (!subin.isEmpty()) {
			int cur = subin.poll();
			int[] moves = { cur + 1, cur - 1, cur * 2 };
			for (int m : moves) {
				// 밖을 벗어나거나 이미 방문한 지점이면 넘어간다.
				if (m < 0 || m >= MAX || visited[m])
					continue;

				visited[m] = true; // 방문체크

				cnt[m] = cnt[cur] + 1; // 걸음수 설정

				// 동생 발견
				if (K == m)
					break;

				// 큐에 지점 추가
				subin.add(m);
			}
		}
		System.out.println(cnt[K]);

	}

}
