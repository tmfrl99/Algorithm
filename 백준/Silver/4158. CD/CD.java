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
			int cnt = 0;

			int[] sang = new int[N];
			int[] sun = new int[M];

			for (int i = 0; i < N; i++) {
				sang[i] = Integer.parseInt(br.readLine());
			}

			for (int i = 0; i < N; i++) {
				sun[i] = Integer.parseInt(br.readLine());
			}

			int p1 = 0;
			int p2 = 0;

			while (p1 < N && p2 < M) {
				if (sang[p1] == sun[p2]) {
					cnt++;
					p1++;
					p2++;
				} else if (sang[p1] < sun[p2]) {
					p1++;
				} else {
					p2++;
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