class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
      boolean check = false;
		int j = 0;
		int k = 0;

		for (String goal_word : goal) {
			if (j < cards1.length && cards1[j].equals(goal_word)) {
				j++;
				check = true;
			} else if (k < cards2.length && cards2[k].equals(goal_word)) {
				k++;
				check = true;
			} else {
				return "No";
			}
		}

		return check ? "Yes" : "No";
    }
}