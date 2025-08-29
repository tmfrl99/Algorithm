import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char gameType = st.nextToken().charAt(0);

        Set<String> players = new HashSet<>();
        for (int i = 0; i < N; i++) {
            players.add(br.readLine());
        }

        int required = 0;
        if (gameType == 'Y') required = 2;
        else if (gameType == 'F') required = 3;
        else if (gameType == 'O') required = 4;

        bw.write(String.valueOf(players.size() / (required - 1)));
        bw.flush();
		bw.close();
		br.close();
    }
}
