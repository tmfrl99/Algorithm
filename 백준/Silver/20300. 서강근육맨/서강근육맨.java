import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] lose = new long[n];
        for (int i = 0; i < n; i++) {
            lose[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(lose);

        long max = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                max = Math.max(max, lose[i] + lose[n - 1 - i]);
            }
        } else {
            max = lose[n - 1];
            for (int i = 0; i < (n - 1) / 2; i++) {
                max = Math.max(max, lose[i] + lose[n - 2 - i]);
            }
        }
        
        System.out.println(max);
    }
}