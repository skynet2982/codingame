/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.Scanner;

class Temperatures {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt();
		in.nextLine();
		final String temps = in.nextLine();

		System.err.println(temps);

		int result = 0;
		boolean firstResult = true;

		if (n != 0) {
			final String[] tempsList = temps.split(" ");
			for (final String tmp : tempsList) {
				final int current = Integer.valueOf(tmp);
				final int currentAbs = Math.abs(current);

				if (firstResult) {
					firstResult = false;
					result = current;
				} else {
					if (Math.abs(result) == currentAbs) {
						if (current > 0) {
							result = current;
						}
					} else {
						final int t = Math.min(Math.abs(result), currentAbs);
						if (t < Math.abs(result)) {
							result = current;
						}
					}
				}
			}
		}

		System.out.println(result);
	}
}