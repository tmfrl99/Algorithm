import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		long max = 0;
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max)
				max = arr[i];
		}

		max++;
		long min = 0;

		while(min < max) {
			long total = 0;
			long mid = (min + max) / 2;

			for (int height : arr)
				total += height / mid;

			if (total < n)
				max = mid;
			else
				min = mid + 1;
		}

		bw.write(min - 1 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}