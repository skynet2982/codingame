/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.Scanner;

class PowerOfThorEp1Solution {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);
		final int lightX = in.nextInt();
		final int lightY = in.nextInt();
		final int initialTX = in.nextInt();
		final int initialTY = in.nextInt();

		int thorX = initialTX;
		int thorY = initialTY;

		while (true) {
			final int remainingTurns = in.nextInt();

			String direction = "NONE";

			if (thorX < lightX) {
				thorX += 1;
				if (thorY < lightY) {
					direction = "SE";
					thorY += 1;
				}

				else if (thorY > lightY) {
					direction = "NE";
					thorY -= 1;
				}

				else {
					direction = "E";
				}
			}

			else if (thorX > lightX) {
				thorX -= 1;
				if (thorY < lightY) {
					direction = "SW";
					thorY += 1;
				}

				else if (thorY > lightY) {
					direction = "NW";
					thorY -= 1;
				}

				else {
					direction = "W";
				}
			}

			else {
				if (thorY < lightY) {
					direction = "S";
					thorY += 1;
				}

				else {
					direction = "N";
					thorY -= 1;
				}
			}

			System.out.println(direction);
		}
	}
}