import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		int[] b = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(a);
		b = Arrays.stream(b)
			.boxed().sorted(Collections.reverseOrder())
			.mapToInt(Integer::intValue).toArray();

		int result = 0;
		for (int i = 0; i < n; i++) {
			result += a[i] * b[i];
		}

		System.out.println(result);
	}
}
