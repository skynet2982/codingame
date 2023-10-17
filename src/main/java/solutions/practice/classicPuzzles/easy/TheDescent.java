/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.Scanner;

class TheDescent {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);

		while (true) {
			int mountainIndexMax = 0;
			int mountainHighMax = 0;

			for (int i = 0; i < 8; i++) {

				final int mountainH = in.nextInt();

				final int max = Math.max(mountainH, mountainHighMax);
				if (max > mountainHighMax) {
					mountainHighMax = mountainH;
					mountainIndexMax = i;
				}
			}

			System.err.println("Index : " + mountainIndexMax + " Hauteur : " + mountainHighMax);
			System.out.println(mountainIndexMax);
		}
	}
}