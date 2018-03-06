/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.asciiArt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	private static class Letter {
		private final List<String> lignes;

		public Letter(final String nom) {
			lignes = new ArrayList<>();
		}

		public void addLigne(final String ligne) {
			lignes.add(ligne);
		}

		public List<String> getLignes() {
			return lignes;
		}
	}

	private static List<String> buildChunk(final char[] curChar, final int largeur, final int motLength) {
		final List<String> res = new ArrayList<>(26);
		for (int i = 1; i <= curChar.length; i++) {
			final StringBuilder b = new StringBuilder();
			while (i % largeur != 0 && i < curChar.length) {
				b.append(curChar[i - 1]);
				i++;
			}
			b.append(curChar[i - 1]);
			res.add(b.toString());
			b.setLength(0);
		}

		return res;
	}

	public static String solve(final Scanner in) {
		final Map<String, Letter> alphabet = new HashMap<>();

		final int largeur = in.nextInt();
		final int hauteur = in.nextInt();
		if (in.hasNextLine()) {
			in.nextLine();
		}
		final String mot = in.nextLine();
		final char[] motChar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (final char c : motChar) {
			alphabet.put(String.valueOf(c), new Letter(String.valueOf(c)));
		}

		for (int h = 0; h < hauteur; h++) {
			final String cur = in.nextLine();
			final char[] curChar = cur.toCharArray();
			final List<String> chunks = buildChunk(curChar, largeur, mot.length());
			for (int i = 0; i < motChar.length; i++) {
				alphabet.get(String.valueOf(motChar[i])).addLigne(chunks.get(i));
			}
		}

		final StringBuilder result = new StringBuilder();
		for (int h = 0; h < hauteur; h++) {
			for (final char c : mot.toCharArray()) {
				result.append(alphabet.get(String.valueOf(c).toLowerCase()).getLignes().get(h));
			}
			if (h < hauteur - 1) {
				result.append("\n");
			}
		}

		return result.toString();
	}

}
