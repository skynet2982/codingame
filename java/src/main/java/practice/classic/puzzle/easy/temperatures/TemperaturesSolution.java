/*
 * Author: Robin Péricé (2018)
 */
package practice.classic.puzzle.easy.temperatures;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class TemperaturesSolution {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt(); // the number of temperatures to analyse
		in.nextLine();
		final String temps = in.nextLine(); // the n temperatures expressed as
		// integers ranging from -273 to 5526

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

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(result);
	}
}