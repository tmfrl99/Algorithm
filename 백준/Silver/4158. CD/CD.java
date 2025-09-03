import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (true) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if (N == 0 && M == 0) break;

			Set<Integer> cdNum = new HashSet<>();
			for (int i = 0; i < N; i++) {
				cdNum.add(Integer.parseInt(br.readLine()));
			}

			int cnt = 0;
			for (int i = 0; i < M; i++) {
				if (cdNum.contains(Integer.parseInt(br.readLine()))) {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
