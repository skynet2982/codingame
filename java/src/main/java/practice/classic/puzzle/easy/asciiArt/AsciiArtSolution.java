/*
 * Author: Robin Péricé (2018)
 */
package practice.classic.puzzle.easy.asciiArt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import common.ISolution;

public class AsciiArtSolution implements ISolution {

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

	private static List<String> buildChunk(final char[] curChar, final int width, final int wordLength) {
		final List<String> res = new ArrayList<>(26);
		for (int i = 1; i <= curChar.length; i++) {
			final StringBuilder b = new StringBuilder();
			while (i % width != 0 && i < curChar.length) {
				b.append(curChar[i - 1]);
				i++;
			}
			b.append(curChar[i - 1]);
			res.add(b.toString());
			b.setLength(0);
		}

		return res;
	}

	@Override
	public String solve(final Scanner in) {
		final Map<String, Letter> alphabet = new HashMap<>();

		final int width = in.nextInt();
		final int heigth = in.nextInt();
		if (in.hasNextLine()) {
			in.nextLine();
		}
		final String word = in.nextLine();
		final char[] wordChar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (final char c : wordChar) {
			alphabet.put(String.valueOf(c), new Letter(String.valueOf(c)));
		}

		for (int h = 0; h < heigth; h++) {
			final String cur = in.nextLine();
			final char[] curChar = cur.toCharArray();
			final List<String> chunks = buildChunk(curChar, width, word.length());
			for (int i = 0; i < wordChar.length; i++) {
				alphabet.get(String.valueOf(wordChar[i])).addLigne(chunks.get(i));
			}
		}

		final StringBuilder result = new StringBuilder();
		for (int h = 0; h < heigth; h++) {
			for (final char c : word.toCharArray()) {
				result.append(alphabet.get(String.valueOf(c).toLowerCase()).getLignes().get(h));
			}
			if (h < heigth - 1) {
				result.append("\n");
			}
		}

		return result.toString();
	}

}
