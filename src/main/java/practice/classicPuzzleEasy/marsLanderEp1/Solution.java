/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.marsLanderEp1;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Player {

	public static void main(final String args[]) {
		final Scanner in = new Scanner(System.in);
		final int surfaceN = in.nextInt(); // the number of points used to draw
											// the
											// surface of Mars.
		for (int i = 0; i < surfaceN; i++) {
			final int landX = in.nextInt(); // X coordinate of a surface point.
											// (0 to
			// 6999)
			final int landY = in.nextInt(); // Y coordinate of a surface point.
											// By
			// linking all the points together in a
			// sequential fashion, you form the
			// surface of Mars.
		}

		// game loop
		while (true) {
			final int X = in.nextInt();
			final int Y = in.nextInt();
			final int hSpeed = in.nextInt(); // the horizontal speed (in m/s),
												// can be
			// negative.
			final int vSpeed = in.nextInt(); // the vertical speed (in m/s), can
												// be
			// negative.
			final int fuel = in.nextInt(); // the quantity of remaining fuel in
											// liters.
			final int rotate = in.nextInt(); // the rotation angle in degrees
												// (-90 to
			// 90).
			final int power = in.nextInt(); // the thrust power (0 to 4).

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");

			// 2 integers: rotate power. rotate is the desired rotation angle
			// (should be 0 for level 1), power is the desired thrust power (0
			// to 4).
			System.out.println(Math.abs(vSpeed) >= 40 ? "0 4" : "0 0");
		}
	}
}