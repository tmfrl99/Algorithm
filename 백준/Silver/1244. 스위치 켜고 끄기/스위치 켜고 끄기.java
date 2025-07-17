import java.io.*;
import java.util.*;

public class Main {
	static void Switch(int[] arr, int n) {
		if (arr[n - 1] == 0)
			arr[n - 1] = 1;
		else
			arr[n - 1] = 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int switchCnt = Integer.parseInt(br.readLine());
		int[] switchArr = Arrays.stream(br.readLine().split(" "))
			.mapToInt(Integer::parseInt).toArray();
		int studentCnt = Integer.parseInt(br.readLine());

		while (studentCnt-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if (gender == 1) {
				for (int i = num; i <= switchCnt; i += num)
					Switch(switchArr, i);
			}
			else {
				int k = 1;
				while (num - k - 1 >= 0 && num + k - 1 < switchCnt && switchArr[num - k - 1] == switchArr[num + k - 1]) {
					k++;
				}

				if (k > 1) {
					for (int i = 1; i < k; i++) {
						Switch(switchArr, num - i);
						Switch(switchArr, num + i);
					}
				}
				Switch(switchArr, num);
			}
		}

		for (int i = 0; i < switchCnt; i++) {
			sb.append(switchArr[i]).append(" ");
            
            if ((i + 1) % 20 == 0)
				sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}