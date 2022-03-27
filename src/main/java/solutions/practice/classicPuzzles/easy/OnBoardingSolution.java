/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.Scanner;

class OnBoardingSolution {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);

		while (true) {
			final String enemy1 = in.next();
			final int dist1 = in.nextInt();
			final String enemy2 = in.next();
			final int dist2 = in.nextInt();

			if (dist1 < dist2) {
				System.out.println(enemy1);
			} else {
				System.out.println(enemy2);
			}

		}
	}
}