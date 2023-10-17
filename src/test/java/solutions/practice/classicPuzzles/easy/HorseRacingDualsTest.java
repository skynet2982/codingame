/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.classicPuzzles.easy;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class HorseRacingDualsTest {

	private static final boolean SOLUTION_OK = true;

	@org.testng.annotations.Test(enabled = SOLUTION_OK)
	public void testSolution() {

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("solutions/practice/classicPuzzles/easy/HorseRacingDuals/file01");
			 Scanner sc = new Scanner(resourceAsStream);) {
			final String sol = HorseRacingDuals.sol(sc);
			assertTrue("1".equals(sol));
		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("solutions/practice/classicPuzzles/easy/HorseRacingDuals/file02");
			 Scanner sc = new Scanner(resourceAsStream);) {
			final String sol = HorseRacingDuals.sol(sc);
			assertTrue("1".equals(sol));
		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("solutions/practice/classicPuzzles/easy/HorseRacingDuals/file03");
			 Scanner sc = new Scanner(resourceAsStream);) {
			final String sol = HorseRacingDuals.sol(sc);
			assertTrue("47".equals(sol));
		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}
	}
}
