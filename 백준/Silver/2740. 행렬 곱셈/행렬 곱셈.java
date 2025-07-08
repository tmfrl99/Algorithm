import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int na = Integer.parseInt(st.nextToken());
		int ma = Integer.parseInt(st.nextToken());

		int[][] arrA = new int[na][ma];
		for (int i = 0; i < na; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < ma; j++)
				arrA[i][j] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		int nb = Integer.parseInt(st.nextToken());
		int mb = Integer.parseInt(st.nextToken());

		int[][] arrB = new int[nb][mb];
		for (int i = 0; i < nb; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < mb; j++)

				arrB[i][j] = Integer.parseInt(st.nextToken());
		}

		int sum;
		for (int i = 0; i < na ; i++) {
			for (int j = 0; j < mb; j++) {
				sum = 0;
				for (int k = 0; k < ma; k++) {
					sum += arrA[i][k] * arrB[k][j];
				}
				sb.append(sum).append(" ");
			}
			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}