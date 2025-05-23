import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String st = br.readLine();
		int cntZero = 0;
		int cntOne = 0;
		char prev = st.charAt(0);

		for (int i = 1; i < st.length(); i++) {
			char cur = st.charAt(i);
			if (prev != cur) {
				prev = cur;
				if (cur == '0') {
					cntOne++;
				} else {
					cntZero++;
				}
			}
		}

		if (prev == '0')
			cntZero++;
		else
			cntOne++;

		bw.write(Math.min(cntZero, cntOne) + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}