/*
 * Author: Robin Péricé (2018)
 */
package solutions.practice.sponsoredPuzzles.theGreatDispatch;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TheGreatDispatchTest {

	@org.testng.annotations.Test
	public void test() {
		try (InputStream is = this.getClass().getClassLoader()
				.getResourceAsStream("solutions/practice/sponsoredPuzzles/theGreatDispatch/file06");
			 Scanner sc = new Scanner(is);) {
			// final String sol = Solution.solve(sc);

		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}
	}
}
