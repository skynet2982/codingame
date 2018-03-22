/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.TestException;
import org.testng.annotations.Test;

import common.AbstractTest;
import solutions.practice.classicPuzzles.medium.thereIsTheSpoonEp1.ThereIsTheSpoonEp1Solution;

public class ThereIsTheSpoonEp1Test extends AbstractTest {

	public static void main(final String[] args) {
		try {
			final ThereIsTheSpoonEp1Test test = new ThereIsTheSpoonEp1Test();
			final List<String> testFiles = Arrays.asList("file01");
			final String resourcesFolder = "solutions/practice/classicPuzzles/medium/thereIsTheSpoonEp1/";

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

	@Test
	public void test() {
		final String[] args = new String[0];
		main(args);
	}
}
