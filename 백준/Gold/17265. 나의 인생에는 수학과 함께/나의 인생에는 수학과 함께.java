import java.io.*;
import java.util.*;

public class Main {
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	static int n;
	static int max;
	static int min;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = st.nextToken().charAt(0);
			}
		}

		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		visited[0][0] = true;
		dfs(0, 0, map[0][0] - '0', ' ');

		bw.write(max + " " + min);
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int x, int y, int num, char cal) {
		if (x == n - 1 && y == n - 1) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}

		for (int i = 0; i < 2; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if (!visited[nx][ny]) {
					visited[nx][ny] = true;
					if (map[nx][ny] == '+' || map[nx][ny] == '-' || map[nx][ny] == '*') {
						dfs(nx, ny, num, map[nx][ny]);
					} else {
						int next = map[nx][ny] - '0';
						if (cal == '+') {
							dfs(nx, ny, num + next, ' ');
						} else if (cal == '-') {
							dfs(nx, ny, num - next, ' ');
						} else {
							dfs(nx, ny, num * next, ' ');
						}
					}
					visited[nx][ny] = false;
				}
			}
		}
	}
}