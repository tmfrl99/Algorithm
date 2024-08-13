import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i] * (n - i));
        }
        
        bw.write(max + "\n");
		bw.flush();
		br.close();
		bw.close();
    }
}