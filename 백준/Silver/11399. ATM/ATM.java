import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Integer[] time = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);
        int prev = 0;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += prev + time[i];
            prev += time[i]; 
        }
        
        bw.write(sum + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}