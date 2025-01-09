import java.io.*;
import java.util.*;

public class Main {

	static int node;
	static boolean[] visited;
	static int[] parent;
	static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		node = Integer.parseInt(br.readLine());
		visited = new boolean[node + 1];
		parent = new int[node];

		for (int i = 0; i < node + 1 ;i++) {
			tree.add(new ArrayList<>());
		}

		for (int i = 0; i < node - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			tree.get(a).add(b);
			tree.get(b).add(a);
		}

		bfs(1);

		for (int i = 1; i < node; i++) {
			System.out.println(parent[i]);
		}
	}

	static void bfs(int start) {
		q.add(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			start = q.poll();
			for (int node : tree.get(start)) {
				if (!visited[node]) {
					visited[node] = true;
					q.add(node);
					parent[node - 1] = start;
				}
			}
		}
	}
}
