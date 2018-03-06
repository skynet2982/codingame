/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.theDescent;

import java.util.Scanner;

class Solution {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);

		// game loop
		while (true) {
			int mountainIndexMax = 0;
			int mountainHighMax = 0;

			for (int i = 0; i < 8; i++) {

				final int mountainH = in.nextInt(); // represents the height of
													// one
				// mountain.
				final int max = Math.max(mountainH, mountainHighMax);
				if (max > mountainHighMax) {
					mountainHighMax = mountainH;
					mountainIndexMax = i;
				}
			}

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");
			System.err.println("Index : " + mountainIndexMax + " Hauteur : " + mountainHighMax);
			System.out.println(mountainIndexMax); // The index of the mountain
													// to fire on.
		}
	}
}