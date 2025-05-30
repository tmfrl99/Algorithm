import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, (int[] e1, int[] e2) -> {
			if (e1[1] == e2[1])
				return e1[0] - e2[0];
			else
				return e1[1] - e2[1];
		});

		for (int[] array: arr)
			bw.write(array[0] + " " + array[1] + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}