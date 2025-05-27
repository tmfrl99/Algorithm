import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int start = 0;
		int end = Arrays.stream(arr)
			.max()
			.orElse(0);

		while (start < end) {
			long total = 0;
			int mid = (start + end) / 2;

			for (int height : arr)
				if (height > mid)
					total += height - mid;

			if (total >= m)
				start = mid + 1;
			else
				end = mid;
		}

		bw.write((start - 1) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}