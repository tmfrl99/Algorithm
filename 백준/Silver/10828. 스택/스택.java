import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (order.equals("push"))
				stack.push(Integer.parseInt(st.nextToken()));
			else if (order.equals("pop"))
				if (stack.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(stack.pop()).append("\n");
			else if (order.equals("size"))
				sb.append(stack.size()).append("\n");
			else if (order.equals("empty"))
				if (stack.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
			else if (order.equals("top"))
				if (stack.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(stack.peek()).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}