package practice.classicPuzzleEasy.thereIsTheSpoonEp1;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {

	@org.testng.annotations.Test
	public void test() {
		try (InputStream is = this.getClass().getClassLoader()
				.getResourceAsStream("practice/classicPuzzleEasy/thereIsTheSpoonEp1/file01");
				Scanner sc = new Scanner(is);) {
			Solution.solve(sc);

		} catch (final IOException e) {
			fail(e.getLocalizedMessage());
		}
	}
}
