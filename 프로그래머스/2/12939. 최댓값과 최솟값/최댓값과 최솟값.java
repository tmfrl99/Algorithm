class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);

		for (String num : arr) {
			int n = Integer.parseInt(num);
			if (n < min) {
				min = n;
			} else if (n > max) {
				max = n;
			}
		}
		return min + " " + max;
    }
}