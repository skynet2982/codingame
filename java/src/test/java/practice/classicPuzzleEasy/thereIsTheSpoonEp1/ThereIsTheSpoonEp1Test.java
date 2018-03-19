/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.thereIsTheSpoonEp1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.TestException;

import common.AbstractTest;
import practice.classic.puzzle.medium.thereIsTheSpoonEp1.ThereIsTheSpoonEp1Solution;

public class ThereIsTheSpoonEp1Test extends AbstractTest {

	public static void main(final String[] args) {
		try {
			final ThereIsTheSpoonEp1Test test = new ThereIsTheSpoonEp1Test();
			final List<String> testFiles = Arrays.asList("file01");
			final String resourcesFolder = "practice/classic/puzzle/medium/thereIsTheSpoonEp1/";

			for (final String testFile : testFiles) {
				try (Scanner sc = test.loadTestFile(resourcesFolder + testFile);) {
					final ThereIsTheSpoonEp1Solution solution = new ThereIsTheSpoonEp1Solution();
					final String solve = solution.solve(sc);
					System.out.println(solve);
				}
			}
		} catch (final Exception e) {
			throw new TestException(e);
		}
	}
}
