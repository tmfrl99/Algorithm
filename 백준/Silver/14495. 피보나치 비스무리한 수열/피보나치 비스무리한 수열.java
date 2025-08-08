import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		long[] seq = new long[n + 1];
		for (int i = 1; i < n + 1; i++) {
			if (i <= 3)
				seq[i] = 1;
			else
				seq[i] = seq[i - 1] + seq[i - 3];
		}

		bw.write(String.valueOf(seq[n]));
		bw.flush();
		bw.close();
		br.close();
	}
}