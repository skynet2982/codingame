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

public class UnaryTest extends AbstractTest {
	public static void main(final String[] args) {
		try {
			final UnaryTest test = new UnaryTest();
			final List<String> testFiles = Arrays.asList("file01", "file02", "file03", "file04");
			final String resourcesFolder = "solutions/practice/classicPuzzles/easy/Unary/";

			for (final String testFile : testFiles) {
				try (Scanner sc = test.loadTestFile(resourcesFolder + testFile);) {
					final Unary solution = new Unary();
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
