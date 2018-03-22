/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.TestException;
import org.testng.annotations.Test;

import common.AbstractTest;

public class AsciiArtTest extends AbstractTest {

	public static void main(final String[] args) {
		try {
			final AsciiArtTest test = new AsciiArtTest();
			final List<String> testFiles = Arrays.asList("file01");
			final String resourcesFolder = "solutions/practice/classicPuzzles/easy/asciiArt/";

			for (final String testFile : testFiles) {
				try (Scanner sc = test.loadTestFile(resourcesFolder + testFile);) {
					final AsciiArtSolution solution = new AsciiArtSolution();
					final String solve = solution.solve(sc);
					System.out.println(solve);
				}
			}
		} catch (final Exception e) {
			throw new TestException(e);
		}
	}

	@Test
	public void test() {
		final String[] args = new String[0];
		main(args);
	}
}
