/*
 * Author: Robin Péricé (2022)
 */
package solutions.practice.classicPuzzles.easy.ascii.art;

//////////////////////
// SOLUTION - START //
//  COPY FROM HERE  //
//////////////////////
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * INPUT:
 * - Line 1: the width L of a letter represented in ASCII art. All letters are the same width.
 * - Line 2: the height H of a letter represented in ASCII art. All the letters are the same height.
 * - Line 3: The text line T, composed of N ASCII characters.
 * - Following lines: The character string ABCDEFGHIJKLMNOPQRSTUVWXYZ? represented in ASCII art.
 * OUTPUT:
 * - The text T in ASCII art.
 * - Characters from a to z will be displayed in ASCII art by their uppercase equivalent.
 * - Characters that are not in the ranges [a-z] or [A-Z], will be displayed by ? in ASCII art.
 */
public class Solution {

    public static final char[] ALPHABET = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
			'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '?'};


    private static List<String> buildChunk(char[] curChar, int letterWidth) {

        List<String> result = new ArrayList<>(ALPHABET.length);
        for (int i = 1; i <= curChar.length; i++) {
            StringBuilder b = new StringBuilder();
            while (((i % letterWidth) != 0) && (i < curChar.length)) {
                b.append(curChar[i - 1]);
                i++;
            }
            b.append(curChar[i - 1]);
            result.add(b.toString());
            b.setLength(0);
        }

        return result;
    }

    public static String solve(Scanner in) {

		// Extract width and height
        int letterWidth = in.nextInt();
        int letterHeight = in.nextInt();

		// Escape potential empty char
        if (in.hasNextLine()) {
            in.nextLine();
        }

		// Replace everything that is not in ALPHABET by ?
        String word = in.nextLine().replaceAll("[^a-zA-Z]", "?");

		// Build letter and corresponding ASCII letter map
		Map<String, List<String>> letterToAscii = new HashMap<>();
		for (char letter : ALPHABET) {
            letterToAscii.put(String.valueOf(letter), new ArrayList<>());
        }
        for (int h = 0; h < letterHeight; h++) {
            String cur = in.nextLine();
            char[] curChar = cur.toCharArray();

            List<String> chunks = buildChunk(curChar, letterWidth);
            for (int i = 0; i < ALPHABET.length; i++) {
                letterToAscii.get(String.valueOf(ALPHABET[i])).add(chunks.get(i));
            }
        }

		// Build the ASCII word from letterToAscii
        StringBuilder result = new StringBuilder();
        for (int h = 0; h < letterHeight; h++) {
            for (char charInWord : word.toCharArray()) {
                result.append(letterToAscii.get(String.valueOf(charInWord).toLowerCase()).get(h));
            }
            if (h < (letterHeight - 1)) {
                result.append("\n");
            }
        }

        return result.toString();
    }

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println(solve(in));
	}
}
//////////////////////
// SOLUTION - END //
//  COPY FROM HERE  //
//////////////////////
