import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt;

		if (n == 1)
			cnt = 1;
		else if (n == 2)
			cnt = Math.min(4, (m + 1) / 2);
		else
			if (m < 7)
				cnt = Math.min(4, m);
			else
				cnt = m - 2;

		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}