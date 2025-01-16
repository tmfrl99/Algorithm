import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static String str;
	public static void main(String[] args) throws IOException {
		new Main().Solution();
	}

	public void Solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		str = br.readLine();
		int cntB = 0;
		int cntR = 0;
		char bf = '\0';

		for (int i = 0; i < N; i++) {
			char ch = str.charAt(i);
			if (ch != bf) {
				if (ch == 'B')
					cntB++;
				else
					cntR++;
			}
			bf = ch;
		}

		System.out.println(1 + Math.min(cntB, cntR));
	}
}
