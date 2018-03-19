/*
 * Author: Robin Péricé (2018)
 */
package practice.classic.puzzle.easy.horseRacing;

import java.util.Arrays;
import java.util.Scanner;

public class HorseRacingSolution {
	private static String findHorse(final Scanner input) {
		final int N = input.nextInt();
		final int[] ints = new int[N];
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

	public static String sol(final Scanner input) {
		final String result = findHorse(input);
		return result;
	}

}
