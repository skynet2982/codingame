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

public class ChuckNorrisTest extends AbstractTest {
	public static void main(final String[] args) {
		try {
			final ChuckNorrisTest test = new ChuckNorrisTest();
			final List<String> testFiles = Arrays.asList("file01", "file02", "file03", "file04");
			final String resourcesFolder = "solutions/practice/classicPuzzles/easy/chuckNorris/";

			for (final String testFile : testFiles) {
				try (Scanner sc = test.loadTestFile(resourcesFolder + testFile);) {
					final ChuckNorrisSolution solution = new ChuckNorrisSolution();
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
