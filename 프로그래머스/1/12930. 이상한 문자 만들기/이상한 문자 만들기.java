class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
		String[] arr = s.split("");

		int key = 0;
		String answer = "";

		for (String word : arr) {
			if (key % 2 == 0) {
				word = word.toUpperCase();
			}

			if (word.isBlank()) {
				key = -1;
			}

			answer += word;
			key++;
		}
		return answer;
    }
}