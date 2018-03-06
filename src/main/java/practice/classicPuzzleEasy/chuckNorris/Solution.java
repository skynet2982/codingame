/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.chuckNorris;

public class Solution {

	public static String solve(final String input) {

		final String strToBin = strToBin(input);
		final StringBuilder r = new StringBuilder();

		final char[] chars = strToBin.toCharArray();

		bigloop: for (int i = 0; i < chars.length; i = i) {

			if (chars[i] == '1') {
				r.append("0 ");
				char cur = chars[i];
				char pre = '1';
				while (cur == pre) {
					r.append("0");

					if (i >= chars.length - 1) {
						break bigloop;
					}
					pre = chars[i];
					i++;
					cur = chars[i];
				}
				r.append(" ");

			} else {
				r.append("00 ");
				char cur = chars[i];
				char pre = '0';
				while (cur == pre) {
					r.append("0");
					if (i >= chars.length - 1) {
						break bigloop;
					}
					pre = chars[i];
					i++;
					cur = chars[i];
				}
				r.append(" ");
			}
		}

		return r.toString();

	}

	private static String strToBin(final String s) {
		final StringBuilder builder = new StringBuilder();
		for (final char c : s.toCharArray()) {
			builder.append(Integer.toBinaryString(c));
		}
		while (builder.length() % 7 != 0) {
			builder.insert(0, "0");
		}
		return builder.toString();
	}
}
