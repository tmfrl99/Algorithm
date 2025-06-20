import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i < n + 1; i++)
			queue.add(i);

		StringBuilder sb = new StringBuilder();
		sb.append("<");

		while (queue.size() > 1) {
			for (int i = 0; i < k - 1; i++) {
				int j = queue.poll();
				queue.offer(j);
			}

			sb.append(queue.poll()).append(", ");
		}

		bw.write(sb.append(queue.poll()).append(">").toString());
		bw.flush();
		bw.close();
		br.close();
	}
}