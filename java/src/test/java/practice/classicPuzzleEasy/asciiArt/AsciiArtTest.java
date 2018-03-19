/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.asciiArt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.TestException;

import common.AbstractTest;
import practice.classic.puzzle.easy.asciiArt.AsciiArtSolution;

public class AsciiArtTest extends AbstractTest {
	public static void main(final String[] args) {
		try {
			final AsciiArtTest test = new AsciiArtTest();
			final List<String> testFiles = Arrays.asList("file01");
			final String resourcesFolder = "practice/classic/puzzle/easy/asciiArt/";

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
}
