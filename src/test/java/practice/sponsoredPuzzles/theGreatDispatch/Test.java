/*
 * Author: Robin Péricé (2018)
 */
package practice.sponsoredPuzzles.theGreatDispatch;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {

	@org.testng.annotations.Test
	public void test() {
		try (InputStream is = this.getClass().getClassLoader()
				.getResourceAsStream("practice/sponsoredPuzzles/theGreatDispatch/test.06");
				Scanner sc = new Scanner(is);) {
			final String sol = Solution.solve(sc);

		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}
	}
}
