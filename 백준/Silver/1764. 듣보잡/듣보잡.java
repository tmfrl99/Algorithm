import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n; i++)
			set.add(br.readLine());

		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if (set.contains(str))
				arr.add(str);
		}

		Collections.sort(arr);
		bw.write(arr.size() + "\n");
		for (String name: arr)
			bw.write(name + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}