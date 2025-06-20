import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		final int SUB_COUNT = 20;

		double sum = 0;
		double sumCredit = 0;
		for (int i = 0; i < SUB_COUNT; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String score = st.nextToken();

			if (score.equals("A+"))
				sum += credit * 4.5;
			else if (score.equals("A0"))
				sum += credit * 4.0;
			else if (score.equals("B+"))
				sum += credit * 3.5;
			else if (score.equals("B0"))
				sum += credit * 3.0;
			else if (score.equals("C+"))
				sum += credit * 2.5;
			else if (score.equals("C0"))
				sum += credit * 2.0;
			else if (score.equals("D+"))
				sum += credit * 1.5;
			else if (score.equals("D0"))
				sum += credit;
			else if (score.equals("F"))
				sum += credit * 0;

			if (!score.equals("P"))
				sumCredit += credit;
		}

		bw.write(sum / sumCredit + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}