/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MimeType {

	public static void main(final String args[]) {
		final StringBuilder b = new StringBuilder();

		final Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		// association table.
		final int Q = in.nextInt();
		final Map<String, String> typeMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			final String EXT = in.next().toLowerCase();
			final String MT = in.next();
			typeMap.put(EXT, MT);
		}

		in.nextLine();
		for (int i = 0; i < Q; i++) {
			final String FNAME = in.nextLine();

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

		System.out.println(b.toString());
	}
}