import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};

	static int dfs(int x, int y, int height) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1) continue;
			if (visited[nx][ny]) continue;
			if (map[nx][ny] > height)
				dfs(nx, ny, height);
		}

		return 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		int maxHeight = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());

				if (map[i][j] > maxHeight)
					maxHeight = map[i][j];
			}
		}

		int max = 0;
		for (int height = 0; height <= maxHeight; height++) {
			visited = new boolean[n][n];
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (!visited[i][j] && map[i][j] > height)
						cnt += dfs(i, j, height);
				}
			}

			if (cnt > max)
				max = cnt;
		}

		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		br.close();
	}
}