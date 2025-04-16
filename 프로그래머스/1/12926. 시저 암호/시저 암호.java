class Solution {
    public String solution(String s, int n) {
       String answer = "";
		char[] arrCh = s.toCharArray();
		for (char ch : arrCh) {
			if (ch == ' ') {
				answer += ch;
				continue;
			}

			if (ch >= 'a' && ch <= 'z') {
				answer +=  (char)((ch - 'a' + n) % 26 + 'a');
			} else {
				answer += (char)((ch - 'A' + n) % 26 + 'A');
			}
		}

		return answer;
    }
}