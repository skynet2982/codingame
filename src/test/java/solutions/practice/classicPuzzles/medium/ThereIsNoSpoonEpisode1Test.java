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

public class ThereIsNoSpoonEpisode1Test extends AbstractTest {

	public static void main(final String[] args) {
		try {
			final ThereIsNoSpoonEpisode1Test test = new ThereIsNoSpoonEpisode1Test();
			final List<String> testFiles = Arrays.asList("file01");
			final String resourcesFolder = "solutions/practice/classicPuzzles/medium/ThereIsNoSpoonEpisode1/";

			for (final String testFile : testFiles) {
				try (Scanner sc = test.loadTestFile(resourcesFolder + testFile);) {
					final ThereIsNoSpoonEpisode1 solution = new ThereIsNoSpoonEpisode1();
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
