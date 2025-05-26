import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];

		for (int i = 0; i < n; i++)
			words[i] = br.readLine();
        
		Set<String> set = new HashSet<>(Arrays.asList(words));
		words = set.toArray(new String[0]);

		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length())
					return s1.length() - s2.length();
				else
					return s1.compareTo(s2);
			}
		});

		for (String word: words)
			bw.write(word + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}