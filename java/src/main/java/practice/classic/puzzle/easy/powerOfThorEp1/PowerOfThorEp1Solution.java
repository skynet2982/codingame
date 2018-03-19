/*
 * Author: Robin Péricé (2018)
 */
package practice.classic.puzzle.easy.powerOfThorEp1;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement. --- Hint: You can use the debug stream to
 * print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class PowerOfThorEp1Solution {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);
		final int lightX = in.nextInt(); // the X position of the light of power
		final int lightY = in.nextInt(); // the Y position of the light of power
		final int initialTX = in.nextInt(); // Thor's starting X position
		final int initialTY = in.nextInt(); // Thor's starting Y position

		int thorX = initialTX;
		int thorY = initialTY;

		// game loop
		while (true) {
			final int remainingTurns = in.nextInt(); // The remaining amount of
														// turns
			// Thor can move. Do not remove
			// this line.
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

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");

			// A single line providing the move to be made: N NE E SE S SW W or
			// NW
			System.out.println(direction);
		}
	}
}