import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] rope = new int[n];

		for (int i = 0; i < n; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(rope);

		int max = 0;
		for (int i = 0; i < n; i ++) {
			max = Math.max(max, rope[i] * (n - i));
		}

		bw.write(max + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}