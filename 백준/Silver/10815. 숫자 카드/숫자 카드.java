import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			set.add(Integer.parseInt(st.nextToken()));

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder(m);
		for (int i = 0; i < m; i++) {
			int j = Integer.parseInt(st.nextToken());
			if (set.contains(j))
				sb.append('1');
			else
				sb.append('0');
			sb.append(' ');
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}