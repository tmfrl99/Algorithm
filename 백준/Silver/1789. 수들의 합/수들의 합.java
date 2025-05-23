import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Long.parseLong(br.readLine());
		int i = 1;

		while (true) {
			if (n < i)
				break;
			n -= i;
			i++;
		}

		bw.write(--i + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}