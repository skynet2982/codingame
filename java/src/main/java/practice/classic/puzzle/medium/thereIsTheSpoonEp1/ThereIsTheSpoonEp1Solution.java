/*
 * Author: Robin Péricé (2018)
 */
package practice.classic.puzzle.medium.thereIsTheSpoonEp1;

import java.util.Scanner;

import common.ISolution;

public class ThereIsTheSpoonEp1Solution implements ISolution {

	public static class Case {
		boolean isNode;
		int x;
		int y;

		public Case(final int x, final int y, final boolean isNode) {
			this.x = x;
			this.y = y;
			this.isNode = isNode;
		}
	}

	static int height;

	static int width;

	public String compute(final Case c, final Case[][] grille) {

		if (c.isNode) {
			final StringBuilder b = new StringBuilder();
			b.append(c.x + " " + c.y);

			if (c.x + 1 >= width || width == 1) {
				b.append(" -1 -1");
			} else {

				int i = 1;
				boolean voisin = false;
				while (c.x + i < width) {
					final Case voisinDroite = grille[c.y][c.x + i];
					if (voisinDroite.isNode) {
						b.append(" " + voisinDroite.x + " " + voisinDroite.y);
						voisin = true;
						break;
					}
					i++;
				}
				if (!voisin) {
					b.append(" -1 -1");
				}
			}

			if (c.y + 1 >= height || height == 1) {
				b.append(" -1 -1");
			} else {
				int i = 1;
				boolean voisin = false;
				while (c.y + i < height) {
					final Case voisinDessous = grille[c.y + i][c.x];
					if (voisinDessous.isNode) {
						b.append(" " + voisinDessous.x + " " + voisinDessous.y);
						voisin = true;
						break;
					}
					i++;
				}
				if (!voisin) {
					b.append(" -1 -1");
				}
			}
			return b.toString();
		}
		return "";

	}

	@Override
	public String solve(final Scanner in) {
		width = in.nextInt();
		height = in.nextInt();
		final Case[][] grille = new Case[height][width];
		if (in.hasNextLine()) {
			in.nextLine();
		}
		final String[] lines = new String[height];

		for (int i = 0; i < height; i++) {
			final String line = in.nextLine();
			lines[i] = line;

			final Case[] ligne = new Case[width];
			int j = 0;
			for (final char c : line.toCharArray()) {
				if (c == '0') {
					ligne[j] = new Case(j, i, true);
				} else {
					ligne[j] = new Case(j, i, false);
				}
				j++;
			}
			grille[i] = ligne;
		}

		final StringBuilder builder = new StringBuilder();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				final String compute = compute(grille[i][j], grille);
				if (!compute.isEmpty()) {
					builder.append(compute + "\n");
				}
			}
		}
		return builder.toString();
	}

}