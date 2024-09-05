import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {

        Arrays.sort(arr);
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                index++;
            }
        }
        
        if (index == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[index];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[cnt++] = arr[i];
            }
        }
        
        return answer;
    }
}