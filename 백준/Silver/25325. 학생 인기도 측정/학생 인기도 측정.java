import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> hashMap = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			hashMap.put(st.nextToken(), 0);
		}

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				String student = st.nextToken();
				hashMap.replace(student, hashMap.get(student) + 1);
			}
		}

		List<String> keySet = new ArrayList<>(hashMap.keySet());

		keySet.sort((o1, o2) -> { // 정렬
			if(hashMap.get(o1) - hashMap.get(o2) == 0)
				return o1.compareTo(o2);
			else
				return hashMap.get(o2) - hashMap.get(o1);
		});

		for (String key : keySet) {
			sb.append(key).append(" ").append(hashMap.get(key)).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}