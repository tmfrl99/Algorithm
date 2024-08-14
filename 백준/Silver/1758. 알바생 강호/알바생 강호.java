import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Integer[] tips = new Integer[n];
        for (int i = 0; i < n; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tips, Collections.reverseOrder());

        long maxTips = 0;
        for (int i = 0; i < n; i++) {
            if (tips[i] - i <= 0) {
                break;
            }
            maxTips += tips[i] - i;
        }
        
        bw.write(maxTips + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}