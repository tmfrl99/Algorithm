import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int digits = String.valueOf(n).length();
		long answer = 0;

		for (int i = 1; i < digits; i++)
			answer += 9L * (long)Math.pow(10, i - 1) * i;

		answer += (long)(n - (int)Math.pow(10, digits - 1) + 1) * digits;
		
        bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}
