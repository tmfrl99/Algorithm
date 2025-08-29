import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String game = st.nextToken();

		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			set.add(name);
		}

		int result = 0;
		switch (game) {
			case "Y":
				result = set.size();
				break;
			case "F":
				result = set.size() / 2;
				break;
			case "O":
				result = set.size() / 3;
				break;
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}