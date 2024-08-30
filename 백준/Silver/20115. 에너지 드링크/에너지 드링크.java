import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] energy = new double[n];
        double max = 0;
        for (int i = 0; i < n; i++) {
            energy[i] = Double.parseDouble(st.nextToken());
            if (max < energy[i]) {
                max = energy[i];
            }
        }

        double sum = max;
        for (int i = 0; i < n; i++) {
            if (energy[i] == max) {
                continue;
            }
            sum += energy[i] / 2;
        }
        System.out.println(sum);
    }
}