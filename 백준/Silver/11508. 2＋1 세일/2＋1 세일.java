import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Integer[] price = new Integer[n];
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(price, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i > 1 && (i + 1) % 3 == 0) {
                continue;
            }
            sum += price[i];
        }
        
        bw.write(sum + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}