import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		double sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		Arrays.sort(arr);

		int mode = arr[0];
		int maxCnt = -1;
		int cnt = 0;
		boolean chk = false;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1])
				cnt++;
			else
				cnt = 0;

			if (maxCnt < cnt) {
				maxCnt = cnt;
				mode = arr[i];
				chk = true;
			}
			else if (maxCnt == cnt && chk) {
				mode = arr[i];
				chk = false;
			}
		}

		sb.append(Math.round(sum / n)).append("\n")
			.append(arr[(n - 1) / 2]).append("\n")
			.append(mode).append("\n")
			.append(arr[n - 1] - arr[0]);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
