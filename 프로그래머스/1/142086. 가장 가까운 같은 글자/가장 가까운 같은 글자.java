class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		int cnt;

		for (int i = 0; i < s.length(); i++) {
			cnt = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					cnt = i - j;
					break;
				}
			}

			if (cnt == 0) {
				answer[i] = -1;
			} else {
				answer[i] = cnt;
			}
		}
		return answer;
    }
}