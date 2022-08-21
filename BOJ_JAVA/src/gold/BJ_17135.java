import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class Main {
	/** 행의 수 */
	private static int N;
	/** 열의 수 */
	private static int M;
	/** 공격거리 */
	private static int D;

	static LinkedList<Enemy> enemiesOrigin;

	static int max = 0;

	static class Enemy {
		int r;
		int c;

		public Enemy(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		enemiesOrigin = new LinkedList<>();
		for (int r = 0; r < N; r++) {
			st = new StringTokenizer(br.readLine());

			for (int c = 0; c < M; c++) {
				if (st.nextToken().equals("1")) {
					enemiesOrigin.add(new Enemy(r + 1, c + 1)); // 배열 시작을 1부터
				}

			}
		}
		// 조합 만들기
		comb(M, 0, 1, new int[3]);
		System.out.println(max);

	}
	/**
	 * 조합을 구해주는 함수
	 * @param C
	 * @param r
	 * @param start
	 * @param result
	 */
	static void comb(int C, int r, int start, int[] result) {
		if (r == 3) {
			LinkedList<Enemy> enemies = new LinkedList<>();
			enemies.addAll(enemiesOrigin);
			play(result, enemies);
		} else {
			for (int i = start; i <= C; i++) {
				result[r] = i;
				comb(C, r + 1, i + 1, result);
			}
		}
	}
	/**
	 * 적 공격 함수
	 * @param archersC
	 * @param enemies
	 */
	static void play(int[] archersC, LinkedList<Enemy> enemies) {
		int result = 0;
		Enemy[] targets = new Enemy[3];	/**공격할 대상을 저장하는 배열*/
		// 적들이 앞으로 오는 것을 궁수들이 가는 것으로 생각
		for (int r = N + 1; r > 1; r--) { // 궁수의 위치는 N + 1부터 시작한다.
			// 성으로 들어간 적은 죽이지 못하므로 배열에서 삭제한다.
			for (int en = enemies.size() - 1; en >= 0; en--) {
				if (enemies.get(en).r < r) {
					break;
				}

				if (enemies.get(en).r <= r) {
					enemies.remove(en);

				}
			}
			// 각 궁수들이 공격 대상을 정한다.
			for (int ar = 0; ar < 3; ar++) {
				int archerC = archersC[ar];
				int killedDistance = D;
				Enemy killed = null;

				// 적 탐색
				for (int en = enemies.size() - 1; en >= 0; en--) {
					Enemy curEn = enemies.get(en);
					int distance = r - curEn.r + Math.abs(curEn.c - archerC);
					if (r - curEn.r > D) { // row가 D의 거리만큼 떨어져 있으면서 에서 archer의 col사이즈보다 작으면 더이상 탐색하지 않아도 된다.
						break;
					} else if (distance <= killedDistance) {
						if (killed != null && distance == killedDistance && curEn.c > killed.c) { // 거리는 같지만 오른쪽에 있는 경우
							continue;
						} else {
							killedDistance = distance;
							killed = curEn;
						}
					}

				}
				// 대상이 있으면 공격할 곳에 넣는다.
				if(killed != null) {
					targets[ar] = killed;
				}
			}
			
			for(int ar = 0; ar < 3; ar++) {
				if (targets[ar] != null) {
					if(enemies.remove(targets[ar])) {
						result++;						
					}
					if (enemies.isEmpty() && result == enemiesOrigin.size()) {
						System.out.println(result);
						System.exit(0);
					}
				}
			}
		}
		if (result > max) {
			max = result;
		}
	}
}
