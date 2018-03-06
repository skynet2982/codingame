/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.mimeType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

	public static void main(final String args[]) {
		final StringBuilder b = new StringBuilder();

		final Scanner in = new Scanner(System.in);
		final int N = in.nextInt(); // Number of elements which make up the
		// association table.
		final int Q = in.nextInt(); // Number Q of file names to be analyzed.
		final Map<String, String> typeMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			final String EXT = in.next().toLowerCase(); // file extension
			final String MT = in.next(); // MIME type.
			typeMap.put(EXT, MT);
		}

		in.nextLine();
		for (int i = 0; i < Q; i++) {
			final String FNAME = in.nextLine(); // One file name per line.
			// System.out.println(FNAME);
			try {
				final String ext = FNAME.substring(FNAME.lastIndexOf(".")).replace(".", "").toLowerCase();
				if (typeMap.containsKey(ext)) {
					b.append(typeMap.get(ext));
				} else {
					b.append("UNKNOWN");
				}
				b.append("\n");
			} catch (final StringIndexOutOfBoundsException e) {
				b.append("UNKNOWN");
				b.append("\n");
			}

		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		// For each of the Q filenames, display on a line the corresponding MIME
		// type. If there is no corresponding type, then display UNKNOWN.
		System.out.println(b.toString());
	}
}