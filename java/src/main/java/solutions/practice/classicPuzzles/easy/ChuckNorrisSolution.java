/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.Scanner;

import common.ISolution;

public class ChuckNorrisSolution implements ISolution {

	@Override
	public String solve(final Scanner in) {

		final String input = in.nextLine();

		final String strToBin = strToBin(input);
		final StringBuilder result = new StringBuilder();

		final char[] chars = strToBin.toCharArray();

		int i = 0;
		while (i < chars.length) {

			char current = chars[i];

			if (current == '1') {
				result.append("0 0");
				
				if (i >= chars.length - 1) {
					break;
				}
				
				char next = chars[i + 1];

				while (current == next) {
					result.append("0");
					i++;
					if (i >= chars.length - 1) {
						break;
					}
					current = chars[i];
					next = chars[i + 1];
				}
				result.append(" ");
			} else {
				result.append("00 0");
				if (i >= chars.length - 1) {
					break;
				}
				char next = chars[i + 1];

				while (current == next) {
					result.append("0");
					i++;
					if (i >= chars.length - 1) {
						break;
					}
					current = chars[i];
					next = chars[i + 1];
				}
				result.append(" ");
			}
			i++;
		}

		char lastChar = result.charAt(result.length() - 1);
		if (' ' == lastChar) {
			result.deleteCharAt(result.length() - 1);
		}
		return result.toString();

	}

	private String strToBin(final String s) {
		byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (int j = 0; j < bytes.length; j++) {
            int val = bytes[j];
            for (int i = 0; i < 7; i++) {
                val <<= 1;
                binary.append((val & 128) == 0 ? 0 : 1);
            }
        }

		return binary.toString();
	}
}
