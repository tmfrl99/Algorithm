import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 1; i <= n; i++) {
			if (i < 10) {
				result += 1;
			}
			else if (i < 100) {
				result += 2;
			}
			else if (i < 1000) {
				result += 3;
			}
			else if (i < 10000) {
				result += 4;
			}
			else if (i < 100000) {
				result += 5;
			}
			else if (i < 1000000) {
				result += 6;
			}
			else if (i < 10000000) {
				result += 7;
			}
			else if (i < 100000000) {
				result += 8;
			}
			else {
				result += 9;
			}
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}