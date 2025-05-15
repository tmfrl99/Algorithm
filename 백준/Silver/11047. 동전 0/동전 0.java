import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] coins = new int[n];

		for (int i = 0; i < n; i++) {
			coins[i] = scanner.nextInt();
		}

		coins = Arrays.stream(coins)
			.boxed().sorted(Collections.reverseOrder())
			.mapToInt(Integer::intValue).toArray();

		int result = 0;
		for (int coin : coins) {
			result += k / coin;
			k %= coin;
		}

		System.out.println(result);
	}
}
