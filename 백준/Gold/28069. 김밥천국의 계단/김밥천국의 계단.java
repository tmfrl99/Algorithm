import java.io.*;
import java.util.*;

public class Main {
	static int n, k;
	static boolean[] visited;

	static class Stair {
		int num;
		int cnt;

		public Stair (int num, int cnt) {
			this.num = num;
			this.cnt = cnt;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		visited = new boolean[n + 1];

		bw.write(bfs());
		bw.flush();
		bw.close();
		br.close();
	}

	static String bfs() {
		Queue<Stair> queue = new LinkedList<>();
		queue.offer(new Stair(0, 0));
		visited[0] = true;

		while (!queue.isEmpty()) {
			Stair now = queue.poll();
			if (now.num == n && now.cnt <= k)
				return "minigimbob";

			if (now.cnt > k)
				break;

			int next = now.num + 1;
			if (next <= n && !visited[next]) {
				queue.offer(new Stair(next, now.cnt + 1));
				visited[next] = true;
			}

			next = now.num + now.num / 2;
			if (next <= n && !visited[next]) {
				queue.offer(new Stair(next, now.cnt + 1));
				visited[next] = true;
			}
		}
		return "water";
	}
}