package chevaux.de.course;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static String sol(final Scanner input) {
		String result = findHorse(input);
		return result;
	}

	private static String findHorse(final Scanner input) {
		int N = input.nextInt();
		int[] ints = new int[N];
		for (int i = 0; i < N; i++) {
			ints[i] = input.nextInt();
		}

		Arrays.sort(ints);
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < N - 1; i++) {
			if (ints[i + 1] - ints[i] < diff) {
				diff = ints[i + 1] - ints[i];
			}
		}

		return String.valueOf(diff);
	}

}
