/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.TestException;
import org.testng.annotations.Test;

import common.AbstractTest;

public class DefibrillatorsTest extends AbstractTest {

	public static void main(final String[] args) {
		try {
			final DefibrillatorsTest test = new DefibrillatorsTest();
			final List<String> testFiles = Arrays.asList("file01", "file02", "file03", "file04");
			final String resourcesFolder = "solutions/practice/classicPuzzles/easy/Defibrillators/";
			final List<String> solutions = Arrays.asList("Maison de la Prevention Sante", "Cimetiere Saint-Etienne",
					"Caisse Primaire d'Assurance Maladie", "Amphitheatre d'O");

			int i = 0;
			for (final String testFile : testFiles) {
				try (Scanner sc = test.loadTestFile(resourcesFolder + testFile);) {
					final Defibrillators solution = new Defibrillators();
					final String solve = solution.solve(sc);
					System.out.println(solve);
					Assert.assertEquals(solve, solutions.get(i++));
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
