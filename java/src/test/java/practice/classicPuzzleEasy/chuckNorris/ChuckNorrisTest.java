/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.chuckNorris;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.TestException;

import common.AbstractTest;
import practice.classic.puzzle.easy.chuckNorris.ChuckNorrisSolution;

public class ChuckNorrisTest extends AbstractTest {
	public static void main(final String[] args) {
		try {
			final ChuckNorrisTest test = new ChuckNorrisTest();
			final List<String> testFiles = Arrays.asList("file01", "file02", "file03", "file04");
			final String resourcesFolder = "practice/classic/puzzle/easy/chuckNorris/";

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
}
