/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.horseRacing;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import practice.classic.puzzle.easy.horseRacing.HorseRacingSolution;

public class HorseRacingTest {

	private static final boolean SOLUTION_OK = true;

	@org.testng.annotations.Test(enabled = SOLUTION_OK)
	public void testSolution() {

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("practice/classic/puzzle/easy/horseRacing/file01");
				Scanner sc = new Scanner(resourceAsStream);) {
			final String sol = HorseRacingSolution.sol(sc);
			assertTrue("1".equals(sol));
		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("practice/classic/puzzle/easy/horseRacing/file02");
				Scanner sc = new Scanner(resourceAsStream);) {
			final String sol = HorseRacingSolution.sol(sc);
			assertTrue("1".equals(sol));
		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("practice/classic/puzzle/easy/horseRacing/file03");
				Scanner sc = new Scanner(resourceAsStream);) {
			final String sol = HorseRacingSolution.sol(sc);
			assertTrue("47".equals(sol));
		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}
	}
}
