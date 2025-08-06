import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] weight = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			weight[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(weight);

		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (weight[i] <= sum + 1) {
				sum += weight[i];
			} else {
				break;
			}
		}

		bw.write(String.valueOf(sum + 1));
		bw.flush();
		bw.close();
		br.close();
	}
}
