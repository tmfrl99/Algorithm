import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String[] arr = str.split("");
		Arrays.sort(arr, Collections.reverseOrder());

		bw.write(String.join("", arr));
		bw.flush();
		bw.close();
		br.close();
	}
}