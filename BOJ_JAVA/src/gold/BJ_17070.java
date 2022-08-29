import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ_17070 {
	private static HashSet<Point> walls;
	private static int N;
	private static int result = 0;

	private static class Point {
		int r;
		int c;

		public Point(int r, int c) {
			this.r = r;
			this.c = c;
		}

		public void move(int r, int c) {
			this.r = r;
			this.c = c;
		}

		@Override
		public String toString() {
			return "Point [r=" + r + ", c=" + c + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + c;
			result = prime * result + r;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (c != other.c)
				return false;
			if (r != other.r)
				return false;
			return true;
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		walls = new HashSet<>();
		Point cur = new Point(1, 2);
		for (int r = 1; r <= N; r++) {
			String s = br.readLine();
			for (int c = 1, index = 0; c <= N; c++, index += 2) {
				if (s.charAt(index) == '1') {
					walls.add(new Point(r, c));
				}
			}
		}
		go(cur, 1);
		System.out.println(result);
	}

	private static void go(Point cur, int type) {
		int curR = cur.r;
		int curC = cur.c;
		switch (type) {
		case 1:
			// 가로
			cur.move(curR, curC + 1);
			if (canGo(cur, 1)) {
				go(cur, 1);
			}
			// 대각선
			cur.move(curR + 1, curC + 1);
			if (canGo(cur, 3)) {
				go(cur, 3);
			}
			break;
		case 2:

			// 세로
			cur.move(curR + 1, curC);
			if (canGo(cur, 2)) {
				go(cur, 2);
			}
			// 대각선
			cur.move(curR + 1, curC + 1);
			if (canGo(cur, 3)) {
				go(cur, 3);
			}
			break;
		case 3:
			// 가로
			cur.move(curR, curC + 1);
			if (canGo(cur, 1)) {
				go(cur, 1);
			}
			// 세로
			cur.move(curR + 1, curC);
			if (canGo(cur, 2)) {
				go(cur, 2);
			}
			// 대각선
			cur.move(curR + 1, curC + 1);
			if (canGo(cur, 3)) {
				go(cur, 3);
			}
			break;
		}
		cur.move(curR, curC);
	}

	private static boolean canGo(Point point, int type) {
		if (point.r > N || point.c > N || walls.contains(point)
				|| (type == 3 && (walls.contains(new Point(point.r, point.c - 1))
						|| walls.contains(new Point(point.r - 1, point.c))))) {
			return false;
		} else if (point.r == N && point.c == N) {
			result++;
			return false;
		} else if (point.r == N) {
			if (type != 2) {
				while (point.c < N) {
					point.c++;
					if (walls.contains(point)) {
						return false;
					}
				}
				result++;
			}
			return false;
		} else if (point.c == N) {
			if (type != 1) {
				while (point.r < N) {
					point.r++;
					if (walls.contains(point)) {
						return false;
					}
				}
				result++;
			}
			return false;
		}

		return true;
	}
}
