import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		boolean isTag = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '<') {
				isTag = true;
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(c);
			}
			else if (c == '>') {
				isTag = false;
				sb.append(c);
			}
			else if (isTag) {
				sb.append(c);
			}
			else {
				if (c == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(c);
				} else {
					stack.push(c);
				}
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}