import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			ArrayList<Character> array = new ArrayList<>();
			boolean isGroup = true;
			for (int j = 0; j < word.length(); j++) {
				Character alpha = word.charAt(j);

				if (j > 0) {
					if (array.contains(alpha) && alpha != word.charAt(j - 1)) {
						isGroup = false;
						break;
					} else {
						array.add(alpha);
					}
				} else {
					array.add(alpha);
				}
			}

			if (isGroup)
				result++;
		}

		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}