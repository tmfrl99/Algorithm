class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int numLength = num_list.length;
        int ansLength = answer.length;
        if (num_list[numLength - 1] > num_list[numLength - 2]) {
            answer[ansLength - 1] = num_list[numLength - 1] - num_list[numLength - 2];
        } else {
            answer[ansLength - 1] = 2 * num_list[numLength - 1];
        }
            
        return answer;
    }
}