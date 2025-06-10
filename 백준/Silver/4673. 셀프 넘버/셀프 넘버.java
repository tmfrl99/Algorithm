import java.io.*;
import java.util.*;

public class Main {
	static int d(int n) {
		String[] str = Integer.toString(n).split("");
		for (String s : str)
			n += Integer.parseInt(s);
		return n;
	}
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i < 10001; i++)
			set.add(d(i));

		for (int i = 1; i < 10001; i++) {
			if (!set.contains(i))
				bw.write(i + "\n");
		}

		bw.flush();
		bw.close();
	}
}